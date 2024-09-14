

package com.mycompany.constructoroverload1;


public class Constructoroverload1 {
    
    
    private String name;
    
    private int age;
    private String gender;
    private String address;


    
    public Constructoroverload1(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = "Unknown";
        this.address = "Unknown";
    }

    // Constructor with all properties
    public Constructoroverload1(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

  

    
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Gender: " + this.gender);
        System.out.println("Address: " + this.address);
    }

    
    public void changeperson(String gender,String address){
        this.gender=gender;
        this.address=address;
    }
    public void changeperson(int age ,String address){
        this.address= address;
        this.age=age;
    }
    public static void main(String[] args) { 
        
        Constructoroverload1 person1 = new Constructoroverload1("sadia", 22);
        Constructoroverload1 person2 = new Constructoroverload1("Kawser", 24, "male", "Mohammadpur");
          System.out.println("Constructor printing sadia info:");
        person1.display();
        System.out.println();
        
        System.out.println("constrcutor printing kawser info:");
        person2.display();
        System.out.println();

       
        System.out.println("method overloading:");
        
        person1.changeperson("female","Mohakhali");
        person2.changeperson(28,"dhanmondi");
        
        person1.display();
        
        System.out.println();
        person2.display();
    }
    }
       

