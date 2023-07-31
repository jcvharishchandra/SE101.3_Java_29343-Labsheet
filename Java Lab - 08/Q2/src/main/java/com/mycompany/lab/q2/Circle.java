package com.mycompany.lab.q2;

public class Circle implements Shape
{
    private double radius;
    
    public Circle(double r)
    {
        radius = r;
    }
    
    public void setRadius(double r1)
    {
        radius = r1;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double calculateArea()
    {
        return (22.0f/7.0f)*radius*radius;
    }
    
    public double calculatePerimeter()
    {
        return 2.0f*(22.0f/7.0f)*radius;
    }
}
