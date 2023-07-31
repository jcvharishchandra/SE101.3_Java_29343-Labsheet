package com.mycompany.javapractical02;

public class Item
{
    private int location;
    private String description;
    
    public Item(int a, String b)
    {
        location = a;
        description = b;
    }
    
    public void setLocation(int c)
    {
        location = c;
    }
    
    public void setDescription(String d)
    {
        description = d;
    }
    
    public int getLocation()
    {
        return location;
    }
    
    public String getDescription()
    {
        return description;
    }
}
