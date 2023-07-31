package com.mycompany.javapractical04;

public class JavaPractical04
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.setName("Hansa");
        s1.setId(100);
        s1.setCourse("Computer Science");
        System.out.println("Student Name = "+s1.getName());
        System.out.println("Student Id = "+s1.getId());
        System.out.println("Student Course = "+s1.getCourse());
        
        Lecturer l1 = new Lecturer();
        l1.setName("Nimal");
        l1.setId(1000);
        l1.setProg("Java");
        System.out.println("Lecturer Name = "+l1.getName());
        System.out.println("Lecturer Id = "+l1.getId());
        System.out.println("Lecturer Programme = "+l1.getProg());
    }
}
