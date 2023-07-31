package com.mycompany.javapractical03;

public class EncapsulatedClass
{
    private String name;
    private int age;
    private double salary;
    
    public EncapsulatedClass(String i, int j,double k)
    {
        name = i;
        age = j;
        salary = k;
    }
    
    public void setName(String a)
    {
        name = a;
    }
    
    public void setAge(int b)
    {
        age = b;
    }
    
    public void setSalary(double c)
    {
        salary = c;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public double getSalary()
    {
        return salary;
    }
}
