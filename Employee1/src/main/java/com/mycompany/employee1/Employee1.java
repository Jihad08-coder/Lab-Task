/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employee1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;


public class Employee1 {
  
    private String name;
    private int age;
    private String designation;
    private double salary;

    
    private static String company_Name;
    private static String company_Address;
    private static int empcnt = 0;

   
    public Employee1(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        empcnt++;   //employeement count....
    }

    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
        System.out.println("Company Name: " + company_Name);
        System.out.println("Company Address: " + company_Address);
    }

   
    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + empcnt);
    }

    
    public static void setCompanyDetails(String name, String address) {
        company_Name = name;
        company_Address = address;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter the name of company: ");
        String compName = scanner.nextLine();
        System.out.print("Enter the company address: ");
        String compAddress = scanner.nextLine();
        Employee1.setCompanyDetails(compName, compAddress);

        
        System.out.println("Enter informartion for the employee:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Designation: ");
        String designation = scanner.nextLine();
        System.out.print("Salary:");
        double salary = scanner.nextDouble();

        
        Employee1 employee = new Employee1(name, age, designation, salary);

       
        System.out.println("\nEmployee Details:");
        employee.display();

    
        System.out.println("\nCompany Details:");
        System.out.println("Company Name: " + company_Name);
        System.out.println("Company Address: " + company_Address);
        System.out.println();
        Employee1.displayTotalEmployees();

        scanner.close();
    }
}
