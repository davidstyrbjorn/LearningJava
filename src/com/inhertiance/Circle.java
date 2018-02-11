package com.inhertiance;

public class Circle implements Shape {

    float radius;

    public Circle(float _radius)
    {
        radius = _radius;
    }

    @Override
    public float getArea()
    {
        return radius*radius*3.14f;
    }

    @Override
    public int getPointCount()
    {
        return -1;
    }

}
