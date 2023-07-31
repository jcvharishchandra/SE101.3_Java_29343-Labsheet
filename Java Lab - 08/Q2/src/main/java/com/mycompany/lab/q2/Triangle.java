package com.mycompany.lab.q2;

public class Triangle implements Shape
{
    private double baseLength;
    private double height;
    
    public Triangle(double bl, double h)
    {
        baseLength = bl;
        height = h;
    }
    
    public void setBaseLength(double bl1)
    {
        baseLength = bl1;
    }
    
    public double getBaseLength()
    {
        return baseLength;
    }
    
    public void setHeight(double h1)
    {
        height = h1;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double calculateArea()
    {
        return 0.5f*baseLength*height;
    }
    
    public double calculatePerimeter()
    {
        return 3.0f*baseLength;
    }
}
