package com.mycompany.lab.q2;

public class Rectangle implements Shape
{
    private double length;
    private double width;
    
    public Rectangle(double l, double w)
    {
        length = l;
        width = w;
    }
    
    public void setLength(double l1)
    {
        length = l1;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public void setWidth(double w1)
    {
        width = w1;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double calculateArea()
    {
        return length*width;
    }
    
    public double calculatePerimeter()
    {
        return 2.0f*(length+width);
    }
}
