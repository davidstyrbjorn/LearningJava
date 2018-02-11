package com.inhertiance;

public class Rectangle implements Shape {

    float width, height;

    public Rectangle(float _width, float _height)
    {
        width = _width;
        height = _height;
    }

    @Override
    public float getArea()
    {
        return width*height;
    }

    @Override
    public int getPointCount()
    {
        return 4;
    }

}
