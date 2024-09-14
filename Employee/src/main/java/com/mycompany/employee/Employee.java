/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee;

/**
 *
 * @author LENOVO
 */
class Employee {
    // Object variables....
    private String name;
    private int age;
    private String designation;
    private double salary;

    // Class variables
    private static String company_Name = "Google.";
    private static String company_Address = "Mountain View, California, United States";
    private static int total_emp = 0;

    // constructor
    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        total_emp++;
    }

    // print employee information....
    public void displayEmployeeDetails() {
        System.out.println("Employee informations :");
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Company Name: " + company_Name);
        System.out.println("Company Address: " + company_Address);
    }

    // print for total number of employyes
    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + total_emp);
    }

    public static void main(String[] args) {
        // Employee objects...
        Employee employee1 = new Employee("Jihad", 23, "Project Manager", 280000);
        Employee employee2 = new Employee("Nironto", 22, "Software Engineer", 205000);
        Employee employee3 = new Employee("kawser", 24, "cyber security", 210000);

        //  employee details
        employee1.displayEmployeeDetails();
        System.out.println();
        System.out.println();
        
       
        
        employee2.displayEmployeeDetails();
        System.out.println();
        System.out.println();
        
        employee3.displayEmployeeDetails();
        System.out.println();

      
        Employee.displayTotalEmployees();
    }
}

