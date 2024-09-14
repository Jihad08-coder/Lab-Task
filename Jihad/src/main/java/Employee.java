/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Employee {

    // Instance variables
    private String name;
    private int age;
    private String designation;
    private double salary;

    // Class variables
    private static String companyName = "ABC Corp";
    private static String companyAddress = "123 Main Street, Anytown, USA";
    private static int employeeCount = 0;

    // Parameterized constructor
    public Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        employeeCount++;
    }

    // Instance method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: $" + salary);
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Address: " + companyAddress);
        System.out.println();
    }

    // Class method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total number of employees: " + employeeCount);
    }

    public static void main(String[] args) {
        // Creating 3 Employee objects using the parameterized constructor
        Employee emp1 = new Employee("John Doe", 30, "Software Engineer", 60000);
        Employee emp2 = new Employee("Jane Smith", 25, "Data Analyst", 55000);
        Employee emp3 = new Employee("Emily Davis", 28, "Product Manager", 75000);

        // Displaying employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
        emp3.displayEmployeeDetails();

        // Displaying total number of employees
        Employee.displayTotalEmployees();
    }
}

