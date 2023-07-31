package com.mycompany.lab.q1;

public class CheckingAccount extends BankAccount
{
    private float checkingInterest = 2.0f;
    
    public float calculateInterest()
    {
        return (getBalance())*(checkingInterest/100.0f);
    }
}
