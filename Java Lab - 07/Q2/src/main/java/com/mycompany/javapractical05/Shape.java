package com.mycompany.javapractical05;

public abstract class Shape
{
    protected double area;
    
    public abstract void calculateArea();
    
    public void display()
    {
        System.out.println("Area = "+area);
    }
}
