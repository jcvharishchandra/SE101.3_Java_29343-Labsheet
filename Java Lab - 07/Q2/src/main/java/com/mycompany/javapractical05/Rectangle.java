package com.mycompany.javapractical05;

public class Rectangle extends Shape
{
    private double length;
    private double width;
    
    public Rectangle(double a, double b)
    {
        length = a;
        width = b;
    }
    
    public void calculateArea()
    {
        area = length*width;
    }
}
