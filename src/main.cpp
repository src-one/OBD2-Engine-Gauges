
#include <Arduino.h>
//#include <WiFi.h>
//#include <ESPmDNS.h>
//#include <WiFiUdp.h>
//#include <ArduinoOTA.h>

#include <Wire.h>
//#include <OBD2UART.h>

#define LED_BUILTIN 2
//#define DEBUG false

#define U8G2_16BIT
//#include <U8x8lib.h>
#include <SPI.h>
#include <U8g2lib.h>

#define ELM_TIMEOUT 9000
#define ELM_BAUD_RATE 9600
#define ELM_PORT Serial3
//#define ELM_WIFI true
#define ELM_BLUETOOTH true

#include <ELM327.h>
#include <gfx.h>
#include <boost.h>
#include <Smoother.h>

TaskHandle_t TaskA;

// Enable U8G2_16BIT in u8g2.h
U8G2_SSD1322_NHD_256X64_F_4W_HW_SPI u8g2(U8G2_R0, 5, 17, 16);

Elm327 Elm;
GFX gfx;
Boost boost;
Smoother smoother;

byte status;

volatile int coolant_temperature = 0;
volatile int oil_temperature = 0;
volatile int load = 0;
volatile int rpm = 0;
volatile int actual_torque = 0;
volatile int demand_torque = 0;
volatile int demand_torque_smoothed = 0;

void initScreen()
{
    u8g2.clearDisplay();
    u8g2.clearBuffer();
    //u8g2.drawStr(1, 20, DisplayString.c_str());

    u8g2.setFont(u8g2_font_synchronizer_nbp_tf);
    //u8g2.setFont(u8g2_font_artossans8_8n);
    //u8g2.setFontRefHeightExtendedText();
    u8g2.setDrawColor(1);
    u8g2.setFontPosTop();
    u8g2.setFontDirection(0);
    //u8g2.setFont(u8g2_font_missingplanet_tf);

    u8g2.drawStr(0, 10, "Loading...");

    u8g2.sendBuffer();
}

void updateDisplay()
{
    char buffer[100];

    u8g2.firstPage();
    do
    {
        //gfx.updateGauge(u8g2);
        //gfx.gauge(u8g2, 0, 0, 50, load);
        boost.render(u8g2);

        sprintf(buffer, "Rev.     %5d rpm", rpm);
        u8g2.drawStr(135, 0, buffer);

        sprintf(buffer, "Load     %5d%%", load);
        u8g2.drawStr(135, 10, buffer);

        //sprintf(buffer, "A.Torque %5dNm", actual_torque);
        sprintf(buffer, "A.Torque %5dNm", actual_torque);
        u8g2.drawStr(135, 20, buffer);

        sprintf(buffer, "D.Torque %5dNm", demand_torque_smoothed);
        u8g2.drawStr(135, 30, buffer);

        sprintf(buffer, "Temp %d%cC / %d%cC", coolant_temperature, '°', oil_temperature, '°');
        u8g2.drawStr(135, 40, buffer);

    } while (u8g2.nextPage());

    u8g2.sendBuffer();
}

void DisplayTask(void *parameter)
{
    for (;;)
    {
        demand_torque_smoothed = smoother.update();

        //gfx.setGaugeValue(smoother.getCurrentValue());
        //gfx.moveNeedle();

        boost.setValue(smoother.getCurrentValue());

        updateDisplay();
        //yield();
        delay(1);
    }
}

int retries = 0;
void connect()
{
    char buffer[25];

    Serial.print("Elm begin failed with error: ");

    u8g2.firstPage();
    do
    {
        u8g2.setFont(u8g2_font_synchronizer_nbp_tf);

        sprintf(buffer, "Connecting... Try: %d", retries);
        u8g2.drawStr(10, 10, buffer);

        u8g2.drawFrame(1, 1, 250, 60);
        //boost.render(u8g2);

    } while (u8g2.nextPage());

    status = Elm.begin();
    if (status != ELM_SUCCESS)
    {
        Serial.print("Elm begin failed with error: ");
        Serial.println(status);

        retries++;

        connect();
    }
}

void setup()
{
    Serial.begin(115200);

    u8g2.begin();

    initScreen();

    connect();

    xTaskCreatePinnedToCore(
        DisplayTask,
        "DisplayTask",
        20000,
        NULL,
        1,
        &TaskA,
        0);
}

const long interval_2000 = 2000;
unsigned long previousMillis_2000 = 0;

const long interval_250 = 250;
unsigned long previousMillis_250 = 0;

const long interval_100 = 100;
unsigned long previousMillis_100 = 0;

void task_100()
{
    int temp;

    Elm.actualEngineTorque(temp);
    actual_torque = map(temp, -125, 130, -625, 650);

    Elm.driverDemandEngineTorque(temp);
    demand_torque = map(temp, -125, 130, -625, 650);

    smoother.setTargetValue(demand_torque);
}

void task_250()
{
    int temp;

    Elm.engineRPM(temp);
    rpm = temp;

    Elm.engineLoad(temp);
    load = temp;
}

void task_2000()
{
    int temp;
    
    Elm.coolantTemperature(temp);
    coolant_temperature = temp;

    Elm.oilTemperature(temp);
    oil_temperature = temp;
}

void loop()
{
    unsigned long currentMillis = millis();

    if (currentMillis - previousMillis_100 >= interval_100)
    {
        task_100();
        previousMillis_100 = currentMillis;
    }

    if (currentMillis - previousMillis_250 >= interval_250)
    {
        task_250();
        previousMillis_250 = currentMillis;
    }

    if (currentMillis - previousMillis_2000 >= interval_2000)
    {
        task_2000();
        previousMillis_2000 = currentMillis;
    }
}
