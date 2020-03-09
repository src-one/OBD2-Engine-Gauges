#ifndef GFX_h
#define GFX_h

#include <Arduino.h>
#include <U8g2lib.h>

class GFX
{
public:
    byte actualEngineTorque(byte &torque);

    void progressbar(U8G2 u8g2, int x, int y, int w, int h, float value);
    int rotX(int cx, int r, int degrees);
    int rotY(int cy, int r, int degrees);

    void gauge(U8G2 u8g2, uint8_t x, uint8_t y, uint8_t r, uint8_t percent);
    void setGaugeValue(int value);
    void drawGauge(U8G2 u8g2, byte angle);
    void moveNeedle(void);
    void updateGauge(U8G2 u8g2);

private:
    const byte X_AXIS_MAX_LENGHT = 128;                    // max length x-axis
    const byte Y_AXIS_MAX_LENGHT = 62;                     // max length y-axis
    const byte X_AXIS_CENTER = X_AXIS_MAX_LENGHT / 2;      // center of x-axis
    const byte Y_AXIS_CENTER = Y_AXIS_MAX_LENGHT / 2 + 10; // center of y-axis
    int arc = Y_AXIS_MAX_LENGHT / 2;
    int angle = 0;

    byte SELECTION = 1;

    const byte NEEDLE_MIN = 0;
    const byte NEEDLE_MAX = 90;
    const byte NEEDLE_ZERO_POSITION = 135;
    int pidReturnLoad, needleMovesFrom;
    int gaugeValue = 0;
    u8g2_uint_t needlePosition = 0;
};


#endif