package com.mycompany.javapractical05;

public class InterfaceImplemented implements MyFirstInterface
{
    public void display()
    {
        System.out.println("X = "+X);
        // X = 10;
    }
    
    public void display1()
    {
        System.out.println("Y = "+Y);
        // Y = 20;
    }
    
    /* 3. It is not possible to change the value of X inside the method. Because it is a final variable.*/
}
