#ifndef SMOOTHER_h
#define SMOOTHER_h

#include <Arduino.h>
#include <U8g2lib.h>

class Smoother
{
public:
    int getCurrentValue();
    int getVelocity();
    void setTargetValue(int value);
    int update();

private:
    int targetValue = 0;
    int currentValue = 0;
    int velocity = 0;
};

#endif