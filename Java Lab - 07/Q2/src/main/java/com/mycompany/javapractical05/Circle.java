package com.mycompany.javapractical05;

public class Circle extends Shape
{
    private final double PI = 3.14f;
    private double radius;
    
    public Circle(double r)
    {
        radius = r;
    }
    
    public void calculateArea()
    {
        area = PI*(radius*radius);
    }    
}
