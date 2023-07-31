package com.mycompany.javapractical04;

public class JavaPractical04
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        e1.setEmpID(100);
        e1.setEmpName("Bodgan");
        e1.setEmpDesignation("Yes");
        System.out.println("Emp ID = "+e1.getEmpID());
        System.out.println("Emp Name = "+e1.getEmpName());
        System.out.println("Emp Designation = "+e1.getEmpDesignation());
        Employee e2 = new Employee();
        e2.setEmpID(101);
        e2.setEmpName("Bird");
        e2.setEmpDesignation("No");
        System.out.println("Emp ID = "+e2.getEmpID());
        System.out.println("Emp Name = "+e2.getEmpName());
        System.out.println("Emp Designation = "+e2.getEmpDesignation());
    }
}
