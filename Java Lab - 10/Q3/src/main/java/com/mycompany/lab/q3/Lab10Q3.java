package com.mycompany.lab.q3;

import java.io.*;

public class Lab10Q3
{
    public static void main(String[] args)
    {
        try
        {
            FileReader f1 = new FileReader("Sample.txt");
        }
        catch(FileNotFoundException e1)
        {
            System.out.println("File not found");
        }
    }
}
