package com.mycompany.lab.q2;

public class Lab10Q2
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,10};
        
        try
        {
            System.out.println(arr[7]);
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Array index is out of bound");
        }
    }
}
