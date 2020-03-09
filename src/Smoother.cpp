#include "Smoother.h"

int Smoother::getVelocity(void)
{
    return velocity;
}

int Smoother::getCurrentValue(void)
{
    return currentValue;
}

void Smoother::setTargetValue(int value)
{
    targetValue = value;
}

int Smoother::update(void)
{
    if (velocity < 0)
    {
        if (targetValue > currentValue - velocity * (velocity - 1) / 2)
        {
            velocity++;
        }
        else if (targetValue <= currentValue - (velocity - 1) * (velocity - 2) / 2)
        {
            velocity--;
        }
    }
    else
    {
        if (targetValue < currentValue + velocity * (velocity + 1) / 2)
        {
            velocity--;
        }
        else if (targetValue >= currentValue + (velocity + 1) * (velocity + 2) / 2)
        {
            velocity++;
        }
    }

    currentValue += velocity;

    return currentValue;
}