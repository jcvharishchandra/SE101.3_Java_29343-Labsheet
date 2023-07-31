package com.mycompany.javapractical03;

public class JavaPractical03
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(10000.00);
        e1.setEmpName("Bodgan");
        e1.setBasicSalary(50000.00);
        e1.calculateBonusAmount();
        System.out.println("Employee Name : "+e1.getEmpName());
        System.out.println("Basic Salary : "+e1.getBasicSalary());
        System.out.println("Bonus : "+e1.getBonus());
        System.out.println("Bonus Amount : "+e1.getBonusAmount());
    }
}
