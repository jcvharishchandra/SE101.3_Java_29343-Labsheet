package com.mycompany.javapractical03;

public class JavaPractical03
{
    public static void main(String[] args)
    {
        EncapsulatedClass e1 = new EncapsulatedClass("Sithu", 20, 350000.0);
        System.out.println("Name = "+e1.getName());
        System.out.println("Age = "+e1.getAge());
        System.out.println("Salary = "+e1.getSalary());
        e1.setName("Hansa");
        e1.setAge(10);
        e1.setSalary(25000.50);
        System.out.println("Name = "+e1.getName());
        System.out.println("Age = "+e1.getAge());
        System.out.println("Salary = "+e1.getSalary());
    }
}
