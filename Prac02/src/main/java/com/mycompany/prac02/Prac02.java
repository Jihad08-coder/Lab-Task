/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac02;

/**
 *
 * @author LENOVO
 */
public class Prac02 {
    private String name;
    private int date;
    private String aurthor;
    
    public Prac02(String name, String aurthor,int date ){
        this.name=name;
        this.date=date;
        this.aurthor=aurthor;
    }
    void display(){
        System.out.println("Movie Name:"+name);
        System.out.println("Release Date : "+date);
        System.out.println("Aurthor: "+aurthor);
    }
    

    public static void main(String[] args) {
        
        System.out.println("Movie Information:");
        
        Prac02 m1 = new Prac02("Moana","Disney",2021);
        Prac02 m2 = new Prac02("Tom and jerry","Disney",1990);
        Prac02 m3 = new Prac02("Ninja Hattori","japanese",1995);
        
        m1.display();
        System.out.println();
        m2.display();
        System.out.println();
        m3.display();
    }
}
