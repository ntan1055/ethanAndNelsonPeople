package com.company;

public class Student extends Person {
    private double GPA;
    private int gradeLevel;
    private double weight;
    public abstract String toString();
    public Student(double GPA, int gradeLevel, double weight)
    {
        super(" "," ");
        this.GPA = GPA;
        this.gradeLevel = gradeLevel;
        this.weight = weight;
    }
}
