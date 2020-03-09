#include "gfx.h"

char *LABEL[] = {"TEMP", "LOAD", "COOLANT", "INTAKE", "VOLT", "AMBIENT", "SPEED"};
const byte LABEL_X_POSITION[] = {53, 53, 45, 49, 53, 47, 50}; // predefined x-position of gauge label
const byte LABEL_Y_POSITION = 28;                             // predefined y-position of gauge label
char *SCALELABEL[] = {
    "-20", "5", "30", "55", "80",   // 'In car temperature' scale labels
    "0", "25", "50", "75", "100",   // 'Load' scale
    "-20", "15", "50", "85", "120", // 'Coolant' scale
    "-20", "5", "30", "55", "80",   // 'Intake' scale
    "11", "12", "13", "14", "15",   // 'Voltage' scale
    "-40", "-25", "10", "25", "60", // 'Ambient' scale
    "0", "40", "80", "120", "160"   // 'Speed' scale
};

void GFX::progressbar(U8G2 u8g2, int x, int y, int w, int h, float value)
{
    u8g2.drawFrame(x, y, w, h);
    u8g2.drawBox(x + 2, y + 2, (w - 4) * value, h - 3);
}

int GFX::rotX(int cx, int r, int degrees)
{
    return cx + (r - 2) * cos(2 * PI * (degrees / 360) - PI);
}

int GFX::rotY(int cy, int r, int degrees)
{
    return cy + (r - 2) * sin(2 * PI * (degrees / 360) - PI);
}

void GFX::gauge(U8G2 u8g2, uint8_t x, uint8_t y, uint8_t r, uint8_t percent)
{
    uint8_t rx = x + r;
    uint8_t ry = y + r;

    // draw the outer circle segments
    u8g2.drawCircle(rx, ry, r, U8G2_DRAW_UPPER_LEFT);
    u8g2.drawCircle(rx, ry, r, U8G2_DRAW_UPPER_RIGHT);
    u8g2.drawCircle(rx, ry, r - (r / 8), U8G2_DRAW_UPPER_LEFT);
    u8g2.drawCircle(rx, ry, r - (r / 8), U8G2_DRAW_UPPER_RIGHT);

    // draw the inner disc segments
    u8g2.drawDisc(rx, ry, r / 4, U8G2_DRAW_UPPER_RIGHT);
    u8g2.drawDisc(rx, ry, r / 4, U8G2_DRAW_UPPER_LEFT);

    // the needle
    uint8_t px = rotX(rx, r - r / 8, percent);
    uint8_t py = rotY(ry, r - r / 8, percent);
    u8g2.drawLine(rx, ry, px, py);

    // long ticks
    for (int n = 0; n <= 180; n += 30)
    {
        int x1 = rotX(rx, r, n);
        int y1 = rotY(ry, r, n);
        int x2 = rotX(rx, r - (r / 4), n);
        int y2 = rotY(ry, r - (r / 4), n);

        u8g2.drawLine(x1, y1, x2, y2);
    }

    // short ticks
    for (int n = 0; n <= 180; n += 5)
    {
        int x1 = rotX(rx, r, n);
        int y1 = rotY(ry, r, n);
        int x2 = rotX(rx, r - (r / 16), n);
        int y2 = rotY(ry, r - (r / 16), n);

        u8g2.drawLine(x1, y1, x2, y2);
    }
}

// ------------------------------------------------- drawGauge() ------------------------------------------

void GFX::setGaugeValue(int value)
{
    gaugeValue = value;
    needleMovesFrom = map(value, 0, 100, NEEDLE_MIN, NEEDLE_MAX);
}

void GFX::drawGauge(U8G2 u8g2, byte angle)
{
    // draw border of the gauge
    u8g2.drawCircle(X_AXIS_CENTER, Y_AXIS_CENTER, arc + 6, U8G2_DRAW_UPPER_RIGHT);
    u8g2.drawCircle(X_AXIS_CENTER, Y_AXIS_CENTER, arc + 4, U8G2_DRAW_UPPER_RIGHT);
    u8g2.drawCircle(X_AXIS_CENTER, Y_AXIS_CENTER, arc + 6, U8G2_DRAW_UPPER_LEFT);
    u8g2.drawCircle(X_AXIS_CENTER, Y_AXIS_CENTER, arc + 4, U8G2_DRAW_UPPER_LEFT);

    // draw the needle
    float x1 = sin(2 * angle * 2 * 3.14 / 360);
    float y1 = cos(2 * angle * 2 * 3.14 / 360);

    u8g2.drawLine(X_AXIS_CENTER, Y_AXIS_CENTER, X_AXIS_CENTER + arc * x1, Y_AXIS_CENTER - arc * y1);
/*  
    u8g2.drawDisc(X_AXIS_CENTER, Y_AXIS_CENTER, 5, U8G2_DRAW_UPPER_LEFT);
    u8g2.drawDisc(X_AXIS_CENTER, Y_AXIS_CENTER, 5, U8G2_DRAW_UPPER_RIGHT);
*/
    u8g2.drawDisc(X_AXIS_CENTER, Y_AXIS_CENTER, 3, U8G2_DRAW_UPPER_LEFT);
    u8g2.drawDisc(X_AXIS_CENTER, Y_AXIS_CENTER, 3, U8G2_DRAW_UPPER_RIGHT);
    u8g2.setFont(u8g_font_chikita);

    // show scale labels according to selection
    u8g2.drawStr(18, 42, SCALELABEL[SELECTION * 5 + 0]);
    u8g2.drawStr(25, 17, SCALELABEL[SELECTION * 5 + 1]);
    u8g2.drawStr(60, 10, SCALELABEL[SELECTION * 5 + 2]);
    u8g2.drawStr(95, 17, SCALELABEL[SELECTION * 5 + 3]);
    u8g2.drawStr(105, 42, SCALELABEL[SELECTION * 5 + 4]);

    // show gauge label
    u8g2.setCursor(LABEL_X_POSITION[SELECTION], LABEL_Y_POSITION);
    u8g2.print(LABEL[SELECTION]);

    // show digital value and align its position
    u8g2.setFont(u8g_font_profont22);
    u8g2.setCursor(55, 40);

    u8g2.print(gaugeValue);
}

// ------------------------------------------------- moveNeedle() ------------------------------------------
void GFX::moveNeedle(void)
{
    //       0
    //       |
    //  135 -+- 45         135 = zero position (needle full left), 45 = maximum position (needle fully right)
    //       |
    //      90
    //
    needlePosition = needleMovesFrom;
    if (needlePosition < 45)
    { // quadrant position correction
        needlePosition = needlePosition + NEEDLE_ZERO_POSITION;
    }
    else
    {
        needlePosition = needlePosition - 45;
    }
}

void GFX::updateGauge(U8G2 u8g2)
{
    drawGauge(u8g2, needlePosition);
}