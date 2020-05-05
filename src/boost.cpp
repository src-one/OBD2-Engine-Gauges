#include "boost.h"

void Boost::setRange(int min, int max)
{
    minValue = min;
    maxValue = max;
}

void Boost::setValue(int value)
{
    currentValue = value;

    currentMillis = millis();
    if (currentMillis - startMillis >= period)
    {
        addHistory(value);
        startMillis = currentMillis;
    }
}

void Boost::setVisibleValue(int value)
{
    currentVisibleValue = value;
}

void Boost::setActualValue(int value)
{
    actualValue = value;
}

void Boost::render(U8G2 u8g2)
{
    // Draw current value
    u8g2.setFont(u8g2_font_fub20_tf);
    char cstr[6];

    //dtostrf((float)currentValue, 1, 2, cstr);
    sprintf(cstr, "%d%", currentVisibleValue);
    u8g2.drawStr(0, 0, cstr);

    // Draw max value
    u8g2.setFont(u8g2_font_fub11_tf);

    //dtostrf((float)maxValue, 1, 0, cstr);
    //sprintf(cstr, "%d%", maxValue);
    sprintf(cstr, "%d%", actualValue);

    int yPos = u8g2.getStrWidth(cstr);
    u8g2.drawStr(HISTORY_LENGTH - yPos, 8, cstr);

    drawBarGraph(u8g2, 0, 22, HISTORY_LENGTH, 8);
    drawGraph(u8g2, 0, 32, HISTORY_LENGTH, 31);
}

void Boost::addHistory(int value)
{
    if (value > maxValue)
    {
        maxValue = value;
    }

    if (value < minValue)
    {
        minValue = value;
    }

    history[historyPos] = value;
    historyPos--;

    if (historyPos < 0)
    {
        historyPos = historyLength - 1;
    }
}

int Boost::getHistory(int index)
{
    index += historyPos;

    if (index >= historyLength)
    {
        index = index - historyLength;
    }

    return history[index];
}

void Boost::drawGraph(U8G2 u8g2, int x, int y, int len, int height)
{
    // Draw the lines
    drawHorizontalDottedLine(u8g2, x, y, len);
    drawHorizontalDottedLine(u8g2, x, y + height, len);

    //var absMin = Math.abs(boostMin);
    int absMin = abs(minValue);
    int range = absMin + maxValue;

    // Draw 0 line
    int zeroYPos = mapValueToYPos(absMin, range, y, height);
    drawHorizontalDottedLine(u8g2, x, zeroYPos, len);

    // Draw the graph line
    for (int i = 0; i < historyLength; i++)
    {
        // Scale the values so that the min is always 0
        int valueY = getHistory(i) + absMin;

        // Calculate the coordinants
        int yPos = mapValueToYPos(valueY, range, y, height);
        int xPos = len - i;

        if (yPos < zeroYPos)
        {
            // Point is above zero line, fill in space under graph
            u8g2.drawVLine(xPos, yPos, zeroYPos + 1 - yPos);
            //u8g2.drawPixel(xPos, yPos);
        }
        else
        {
            // Point is below zero line, draw graph line without filling in
            u8g2.drawPixel(xPos, yPos);
        }
    }
}

void Boost::drawBarGraph(U8G2 u8g2, int x, int y, int len, int height)
{
    if (currentValue > 0)
    {
        // Draw the pressure bar behind the graph
        int barLength = ((float)currentValue / maxValue) * len;

        u8g2.setDrawColor(2);
        u8g2.drawBox(x, y, barLength, height);
        u8g2.setDrawColor(1);
    }
}

int Boost::mapValueToYPos(int val, int range, int y, int height)
{
    float valueY = ((float)val / range) * height;
    return y + height - (int)valueY;
}

void Boost::drawHorizontalDottedLine(U8G2 u8g2, int x, int y, int len)
{
    for (int i = 0; i < len; i++)
    {
        if (!(i % 4))
        {
            u8g2.drawPixel(x + i, y);
        }
    }
}
