

package com.mycompany.person;


public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;

     public Person() {
    }

    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

   
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        
        
        Person p1 = new Person();
        
     
        p1.setName("Rafi");
        p1.setAge(24);
        p1.setGender("Male");
        p1.setAddress("Mohammadpur");

        
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Gender: " + p1.getGender());
        System.out.println("Address: " + p1.getAddress());
    }
}
