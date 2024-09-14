
package com.mycompany.employees;


public class Employees {
   
    private String name;
    private int id;
    private double salary;
    private String designation;


    
    public Employees(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 0.0;
        this.designation = "Unknown";
    }

    
    public Employees(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Salary: " + this.salary);
        System.out.println("Designation: " + this.designation);
    }
    
    public void increaseSalary(double amount) {
        this.salary += amount;
    }

    
    public void increaseSalary(double percentage, boolean isPercentage) {
        if (isPercentage) {
            this.salary += this.salary * (percentage / 100);
        }
    }

    public static void main(String[] args) {
        
        Employees emp1 = new Employees("Jihad", 101, 250000, "Developer");
        Employees emp2 = new Employees("kawser", 102);

        
        emp1.display();
        System.out.println();  
        emp2.display();


        emp1.increaseSalary(8000);
        emp1.increaseSalary(10, true);

        System.out.println("\nAfter salary increase:");
        emp1.display();
    }
}


