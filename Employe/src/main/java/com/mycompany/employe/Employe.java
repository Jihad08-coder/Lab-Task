
package com.mycompany.employe;




   public class Employe {
    private String name;
    private int id;
    private double salary;
    private String designation;


    public Employe(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }


    public Employe() {}


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    
    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    public String getDesignation() {
        return designation;
    }

  
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static void main(String[] args) {
        
        Employe emp1 = new Employe();

        
        emp1.setName("Jubair");
        emp1.setId(231);
        emp1.setSalary(80000);
        emp1.setDesignation("Software Engineer");

        
        System.out.println("Employee info:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("ID: " + emp1.getId());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Designation: " + emp1.getDesignation());
    }
}


