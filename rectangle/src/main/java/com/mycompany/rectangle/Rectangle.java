/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rectangle;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Rectangle {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double l,w,perimeter,area;
        System.out.println("Enter length of the triangle ");
        l=input.nextDouble();
        System.out.println("Enter width of the triangle");
        w=input.nextDouble();
        perimeter= 2*(l+w);
        System.out.println("perimeter of rectangle is "+perimeter);
        area =(l*w);
        System.out.println("Area is:"+area);
        
    }
}
