/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student;

/**
 *
 * @author LENOVO
 */
public class Student {
    // Instance variables
    private int id;
    private String name;
    private String dept;
    private double cgpa;
    private String Uniname;

    // Class variable.....
   
    private static int studentCnt = 0;

    // constructor...
    public Student(int id, String name, String dept, double cgpa,String Uniname) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
        this.Uniname=Uniname;
        studentCnt++;
    }

    //  method to display student details.....
    public void displayStudentDetails() {
        System.out.println("ID No.: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University Name: " + Uniname);
    }

    // Class method to display total number of students
    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + studentCnt);
    }

    // Class method for university name
    

    public static void main(String[] args) {
       
        

        // Creating 3 student objects
        Student student1 = new Student(231014082, "Nironto", "Computer Science", 3.9,"ULAB");
        Student student2 = new Student(231014017, "Jihad", "Electrical Engineering", 3.75,"ULAB");
        Student student3 = new Student(231014029, "sadia", "Mathematics", 3.72,"ULAB");

        // showing details of each student
        student1.displayStudentDetails();
        System.out.println();
        
        student2.displayStudentDetails();
        System.out.println();
           Student.displayTotalStudents();
        student3.displayStudentDetails();
        System.out.println();

        // Displaying total number of students
        Student.displayTotalStudents();
    }
}

