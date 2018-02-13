package com.fileIO;

public class Student {

    // Student info
    private String name;
    private double gpa;

    // Constructors
    public Student(String _name, double _gpa){
        this.name = _name;
        this.gpa = _gpa;
    }

    // toString override
    public String toString()
    {
        return ("Name: " + name + ", GPA: " + gpa);
    }

    // Getters
    public String getName() { return name; }
    public double getGpa() { return gpa; }

}
