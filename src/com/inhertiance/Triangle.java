package com.inhertiance;

public class Triangle implements Shape {

    float width, height;

    public Triangle(float _width, float _height)
    {
        width = _width;
        height = _height;
    }

    @Override
    public float getArea()
    {
        return (width*height)/2;
    }

    @Override
    public int getPointCount()
    {
        return 3;
    }

}
