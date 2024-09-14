/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array;

/**
 *
 * @author LENOVO
 */
public class Array {
    public static int calculate_sum(int []array){
        int sum =0;
        for(int num : array){
            sum=sum+num;
        }
        return sum;
        
    }

    public static void main(String[] args) {
        
       int []array={10,20,30,40,50};
       
       int sum  = calculate_sum(array);
        System.out.println("sum of number in the array:"+sum);
    }
}
