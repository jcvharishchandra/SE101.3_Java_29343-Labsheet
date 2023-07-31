package com.mycompany.javapractical03;

public class Employee
{
    private String empName;
    private double basicSalary;
    private double bonus;
    private double bonusAmount;
    
    public Employee(double bon)
    {
        bonus = bon;
    }
    
    public void setEmpName(String a)
    {
        empName = a;
    }
    
    public String getEmpName()
    {
        return empName;
    }
    
    public void setBasicSalary(double b)
    {
        basicSalary = b;
    }
    
    public double getBasicSalary()
    {
        return basicSalary;
    }
    
    public double getBonus()
    {
        return bonus;
    }
    
    public void calculateBonusAmount()
    {
        bonusAmount = bonus + basicSalary;
    }
    
    public double getBonusAmount()
    {
        return bonusAmount;
    }
}
