/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Student1 {
   
    private int id;
    private String name;
    private String department;
    private double cgpa;

    
    private static String university;
    private static int studentCount = 0;

  
    public Student1(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        studentCount++;
    }

    
    public void displaydetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
    }

    
    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + studentCount);
    }

   
    public static void setUniversity(String universityName) {
        university = universityName;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Set the university name
        System.out.print("Enter the university name: ");
        String uni_name = input.nextLine();
        Student1.setUniversity(uni_name);

    
        System.out.println("Enter information  for the student:");
        System.out.println();
        System.out.print("student ID: ");
        int id = input.nextInt();
        input.nextLine(); 
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Department: ");
        String department = input.nextLine();
        System.out.print("CGPA: ");
        double cgpa = input.nextDouble();

         Student1 student = new Student1(id, name, department, cgpa);

        student.displaydetails();
       Student1.displayTotalStudents();
              input.close();
    }
}
