#ifndef BOOST_h
#define BOOST_h

#include <Arduino.h>
#include <U8g2lib.h>

#define HISTORY_LENGTH 128
#define PERIOD 50

class Boost
{
public:
    void setRange(int min, int max);
    void setValue(int value);
    void addHistory(int value);
    void render(U8G2 u8g2);

private:
    int currentValue;
    int maxValue = 0;
    int minValue = 0;

    unsigned long startMillis;
    unsigned long currentMillis;
    const unsigned long period = 50;

    const int historyLength = HISTORY_LENGTH;
    int history[HISTORY_LENGTH];
    int historyPos = HISTORY_LENGTH - 1;

    int getHistory(int index);
    void drawGraph(U8G2 u8g2, int x, int y, int len, int height);
    void drawBarGraph(U8G2 u8g2, int x, int y, int len, int height);
    int mapValueToYPos(int val, int range, int y, int height);
    void drawHorizontalDottedLine(U8G2 u8g2, int x, int y, int len);
};

#endif