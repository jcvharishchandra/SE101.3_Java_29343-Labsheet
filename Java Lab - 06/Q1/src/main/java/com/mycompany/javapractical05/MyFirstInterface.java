package com.mycompany.javapractical05;

public interface MyFirstInterface
{
    public static final int X = 5;
    
    public abstract void display();
    
    int Y = 10;
    /* 1. There is no difference between these two approaches. Because the variables created
          inside an interface are always "public static final" by default.
    */
    
    public void display1();
    /* 2. There is no difference between these two approaches. Because the methods created
          inside an interface are always "abstract" by default.
    */
    
}
