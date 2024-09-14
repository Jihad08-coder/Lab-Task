/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac01;

/**
 *
 * @author LENOVO
 */
public class Prac01 {
    int id;
    String name;
    String dept;
    double cgpa;
    String email;
    
    
    void display(){
         System.out.println("Name : "+name);
        System.out.println("Dept: "+dept);
        System.out.println("cgpa: "+cgpa);
        System.out.println("Email: "+email);
        System.out.println("ID: "+id);    
        System.out.println();
    }
    

    public static void main(String[] args) {
        Prac01 s1=new Prac01();
        s1.name="Jihad";
        s1.id=231014017;
        s1.dept="Cse";
        s1.email="jaj016017@gmail.com";
        s1.cgpa=3.63;
        System.out.println("Name : "+s1.name);
        System.out.println("Dept: "+s1.dept);
        System.out.println("cgpa: "+s1.cgpa);
        System.out.println("Email: "+s1.email);
        System.out.println("ID: "+s1.id);    
        System.out.println();
        
        Prac01 s2=new Prac01();
        s2.name="Sadia";
        s2.cgpa=3.30;
        s2.dept="CSE";
        s2.id=231014029;
        s2.email="Sadiacse@gamil.com";
        s2.display();
        
        
        
        
    }
}
