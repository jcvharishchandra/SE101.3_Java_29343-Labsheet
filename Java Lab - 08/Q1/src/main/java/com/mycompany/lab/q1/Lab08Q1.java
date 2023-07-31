package com.mycompany.lab.q1;

public class Lab08Q1
{
    public static void main(String[] args)
    {
        SavingsAccount s1 = new SavingsAccount();
        s1.setAccountNumber(1001);
        s1.setBalance(20000000);
        System.out.println("Savings Account Interest: "+ s1.calculateInterest());
        
        CheckingAccount c1 = new CheckingAccount();
        c1.setAccountNumber(1001);
        c1.setBalance(1000000);
        System.out.println("Checking Account Interest: "+ c1.calculateInterest());
    }
}
