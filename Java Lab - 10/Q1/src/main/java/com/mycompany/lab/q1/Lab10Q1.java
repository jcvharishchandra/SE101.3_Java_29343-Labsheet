package com.mycompany.lab.q1;

import java.util.Scanner;

public class Lab10Q1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        try
        {
            int div = num1/num2;
            System.out.println("num1/num2 = "+div);
        }
        catch(ArithmeticException e1)
        {
            System.out.println("Divide by zero error");
        }
    }
}
