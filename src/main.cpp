
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
#define ELM_BLUETOOTH_ID {0x00, 0x1D, 0xA5, 0x04, 0x49, 0x8E}

#include <ELM327.h>
#include <gfx.h>
#include <boost.h>
//#include <Smoother.h>
#include <EasingLib.h>
#include <Servo.h>

#include <esp_task_wdt.h>

#include <SplashScreen.h>
#include <Icons.h>

TaskHandle_t TaskA;

// Enable U8G2_16BIT in u8g2.h
U8G2_SSD1322_NHD_256X64_F_4W_HW_SPI u8g2(U8G2_R0, 5, 17, 16);

Elm327 Elm;
GFX gfx;
Boost boost;
//Smoother smoother;
Easing demand_torque_easing(EASE_OUT_QUINT, 500);
Easing actual_torque_easing(EASE_OUT_QUINT, 200);
Servo servo1;

byte status;

static const int servoPin = 2;
int servoPos = 0;

volatile int coolant_temperature = 0;
volatile int oil_temperature = 0;
volatile int intake_air_temperature = 0;
volatile int load = 0;
volatile int rpm = 0;
//volatile int pressure = 0;
volatile float command_equivalent_ratio = 0.0;
volatile int actual_torque = 0;
volatile int actual_torque_smoothed = 0;
volatile int demand_torque = 0;
volatile int demand_torque_smoothed = 0;

void initScreen()
{
    u8g2.clearDisplay();
    u8g2.clearBuffer();
    //u8g2.drawStr(1, 20, DisplayString.c_str());
    //u8g2.setContrast(3);

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
        /*
        u8g2.setFont(u8g2_font_t0_13_tf);
        sprintf(buffer, "Rev.   %5d rpm", rpm);
        u8g2.drawStr(135, 0, buffer);

        sprintf(buffer, "Load      %5d%%", load);
        u8g2.drawStr(135, 12, buffer);

        //sprintf(buffer, "A.Torque %5dNm", actual_torque);
        sprintf(buffer, "A.Torque %5d Nm", actual_torque);
        u8g2.drawStr(135, 24, buffer);

        sprintf(buffer, "D.Torque %5d Nm", demand_torque_smoothed);
        u8g2.drawStr(135, 36, buffer);

        //u8g2.setFont(u8g2_font_missingplanet_tf);
        //u8g2.setFont(u8g2_font_helvB10_tf);
        u8g2.setFont(u8g2_font_t0_13_tf);

        u8g2.drawXBMP(135, 48, icon_16_width, icon_16_height, icon_coolant_temp_16);
        sprintf(buffer, "%3d%cC", coolant_temperature, '°');
        u8g2.drawStr(156, 52, buffer);

        u8g2.drawXBMP(205, 48, icon_16_width, icon_16_height, icon_oil_temp_16);
        sprintf(buffer, "%3d%cC", oil_temperature, '°');
        u8g2.drawStr(226, 52, buffer);

        //sprintf(buffer, "W: %d%cC O: %d%cC", coolant_temperature, '°', oil_temperature, '°');
        //u8g2.drawStr(135, 52, buffer);
*/

        u8g2.setFont(u8g2_font_helvB10_tf);
        //u8g2.setFont(u8g2_font_t0_13_tf);

        u8g2.drawXBMP(130, 0, icon_16_width, icon_16_height, icon_coolant_temp_16);
        sprintf(buffer, "%3d%cC", coolant_temperature, '°');
        u8g2.drawStr(151, 4, buffer);

        u8g2.drawXBMP(200, 0, icon_16_width, icon_16_height, icon_oil_temp_16);
        sprintf(buffer, "%3d%cC", oil_temperature, '°');
        u8g2.drawStr(221, 4, buffer);

        u8g2.drawXBMP(130, 18, icon_16_width, icon_16_height, icon_engine_16);
        sprintf(buffer, "%3d %%", load);
        u8g2.drawStr(151, 20, buffer);

        u8g2.drawXBMP(200, 18, icon_16_width, icon_16_height, af_ratio_16);
        sprintf(buffer, "%.2f", command_equivalent_ratio);
        u8g2.drawStr(221, 20, buffer);

        /*
        u8g2.drawXBMP(130, 18, icon_16_width, icon_16_height, icon_oil_temp_16);
        sprintf(buffer, "%3d%cC", oil_temperature, '°');
        u8g2.drawStr(156, 20, buffer);

        u8g2.drawXBMP(130, 36, icon_16_width, icon_16_height, icon_engine_16);
        sprintf(buffer, "%5d %%", load);
        u8g2.drawStr(156, 38, buffer);
        */

        sprintf(buffer, "%3d%cC", intake_air_temperature, '°');
        u8g2.drawStr(130, 45, buffer);

        sprintf(buffer, "%'5d rpm", rpm);
        u8g2.drawStr(180, 45, buffer);

    } while (u8g2.nextPage());

    u8g2.sendBuffer();
}

unsigned long previousMillis_test = 0;

void DisplayTask(void *parameter)
{
    for (;;)
    {
        //esp_task_wdt_init(999, false);

        //demand_torque_smoothed = smoother.update();
        demand_torque_smoothed = demand_torque_easing.GetValue();
        actual_torque_smoothed = actual_torque_easing.GetValue();

        //gfx.setGaugeValue(smoother.getCurrentValue());
        //gfx.moveNeedle();

        boost.setValue(demand_torque_smoothed);
        boost.setVisibleValue(demand_torque_smoothed);
        boost.setActualValue(actual_torque_smoothed);

        updateDisplay();
        //yield();
        //delay(1);
        //yield();
        unsigned long currentMillis = millis();

        if (currentMillis - previousMillis_test >= 1000)
        {
            vTaskDelay(1);
            previousMillis_test = currentMillis;
        }
        //taskYIELD();
        //wdt_reset();
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
        u8g2.drawXBMP(37, 0, splash_screen_width, splash_screen_height, splash_screen);
        u8g2.drawXBMP(240, 48, icon_16_width, icon_16_height, bt_connect_16);
/*
        u8g2.setFont(u8g2_font_t0_13_tf);

        sprintf(buffer, "Connecting...");
        u8g2.drawStr(180, 0, buffer);
        */
        sprintf(buffer, "#%d", retries);
        u8g2.drawStr(180, 54, buffer);

    } while (u8g2.nextPage());

    status = Elm.begin();
    if (status != ELM_SUCCESS)
    {
        Serial.print("Elm begin failed with error: ");
        Serial.println(status);

        retries++;

        connect();
    }

    if (servoPos != 140)
    {
        servoPos = 140;
        servo1.write(140);
    }
}

void setup()
{
    Serial.begin(115200);

    servo1.attach(servoPin);
    servo1.write(0);

    u8g2.begin();

    initScreen();
    connect();

    xTaskCreatePinnedToCore(
        DisplayTask,
        "DisplayTask",
        20000,
        NULL,
        10,
        &TaskA,
        0);
}

const long interval_2000 = 2000;
unsigned long previousMillis_2000 = 0;

const long interval_250 = 250;
unsigned long previousMillis_250 = 0;

const long interval_100 = 50;
unsigned long previousMillis_100 = 0;

void task_100()
{
    int temp;

    if (Elm.actualEngineTorque(temp) == ELM_SUCCESS)
    {
        //actual_torque = map(temp, -125, 130, -845, 845);
        actual_torque = temp * 6.3;
    }

    if (Elm.driverDemandEngineTorque(temp) == ELM_SUCCESS)
    {
        //demand_torque = map(temp, -125, 130, -845, 845);
        demand_torque = temp * 6.3;
    }

    //smoother.setTargetValue(demand_torque);
    demand_torque_easing.SetSetpoint(demand_torque);
    actual_torque_easing.SetSetpoint(actual_torque);
}

void task_250()
{
    int temp;

    if (Elm.engineRPM(temp) == ELM_SUCCESS)
    {
        rpm = temp;
    }

    if (Elm.engineLoad(temp) == ELM_SUCCESS)
    {
        load = temp;
    }
}

void task_2000()
{
    int temp;
    byte btemp;
    float ftemp;

    if (Elm.coolantTemperature(temp) == ELM_SUCCESS)
    {
        coolant_temperature = temp;
    }

    if (Elm.oilTemperature(temp) == ELM_SUCCESS)
    {
        oil_temperature = temp;
    }

    if (Elm.intakeAirTemperature(temp) == ELM_SUCCESS)
    {
        intake_air_temperature = temp;
    }

    if (Elm.commandEquivalenceRatio(ftemp) == ELM_SUCCESS)
    {
        command_equivalent_ratio = ftemp;
    }

    if (Elm.vehicleSpeed(btemp) == ELM_SUCCESS)
    {
        if (servoPos != atoi((char *)btemp))
        {
            Serial.print("Set Servo: ");
            Serial.println(btemp);
            
            servoPos = atoi((char *)btemp);
            servo1.write(btemp);
        }
    }
}

void loop()
{
    /*
    vTaskDelay(portMAX_DELAY);
    //OR
    vTaskDelete(NULL);
    */

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
