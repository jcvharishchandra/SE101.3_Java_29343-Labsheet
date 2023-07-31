package com.mycompany.lab.q2;

public class Lab08Q2
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(7);
        System.out.println("Area of circle : "+c1.calculateArea());
        System.out.println("Perimeter of circle : "+c1.calculatePerimeter());
        
        Rectangle r1 = new Rectangle(10,10);
        System.out.println("Area of rectangle : "+r1.calculateArea());
        System.out.println("Perimeter of rectangle : "+r1.calculatePerimeter());
        
        Triangle t1 = new Triangle(5, 10);
        System.out.println("Area of triangle : "+t1.calculateArea());
        System.out.println("Perimeter of triangle : "+t1.calculatePerimeter());       
    }
}
