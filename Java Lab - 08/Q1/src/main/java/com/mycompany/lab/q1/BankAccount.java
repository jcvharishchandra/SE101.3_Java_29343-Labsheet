package com.mycompany.lab.q1;

public abstract class BankAccount
{
    private int accountNumber;
    private float balance;
    
    public void setAccountNumber(int accNum)
    {
        accountNumber = accNum;
    }
    
    public void setBalance(float bal)
    {
        balance = bal;
    }
    
    public int getAccountNumber()
    {
        return accountNumber;
    }
    
    public float getBalance()
    {
        return balance;
    }
    
    public abstract float calculateInterest();
}
