/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringdemo;

/**
 *
 * @author LENOVO
 */
public class StringDemo {

   
    public static void main(String args[]) {
        String s1="HELLO java";
        String s2="HELLO java";
        String s3=new String("JaVaClaSs");
        String s4=new String("JaVaClaSs");
        System.out.println("String equality check: ");
        System.out.println("eqaulity: "+ (s1==s2));
        System.out.println("S3 & S4 equality: "+ (s3==s4));
        System.out.println("s1 & s2 equal or not:"+s1.equals(s2));
        System.out.println("equal or not :"+s3.equals(s4));
        System.out.println("\n");
        
        System.out.println("length :"+s1.length()); // s1="HELLO java"
        System.out.println("character at index 2 of s1 :"+s1.charAt(2));
        System.out.println("comapering string between  s1(HELLO java) & s3(JaVaClaSs):"+s3.compareTo(s1));
        System.out.println("s1.indexOf :"+s1.indexOf('L'));
        System.out.println("substring 2 to 7: "+s1.substring(2,7));
        System.out.println("concate : "+s1.concat(s3));
        System.out.println("Upper case : "+s1.toUpperCase());
        System.out.println("lower case: " +s1.toLowerCase());
        System.out.println("empty or not: "+s1.isEmpty());
    }
}
