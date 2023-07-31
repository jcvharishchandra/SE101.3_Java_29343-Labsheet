package com.mycompany.lab.q1;

public class SavingsAccount extends BankAccount
{
    private float savingsInterest = 12.0f;
    
    public float calculateInterest()
    {
        return (getBalance())*(savingsInterest/100.0f);
    }
}
