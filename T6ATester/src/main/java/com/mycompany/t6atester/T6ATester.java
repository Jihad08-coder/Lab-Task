/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t6atester;

/**
 *
 * @author LENOVO
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

public class T6ATester
{
  public static void main(String[] args)
  {
    FinalT6A q1 = new FinalT6A(2,1);
    q1.methodA();
    FinalT6A q2 = new FinalT6A(3,5);
    q2.methodA();  
    q1 = new FinalT6A(5,7);
    q1.methodA();
    q2.methodA();
  }
}

 class FinalT6A{ 
  public  int temp = 4;
  private int sum;
  private int y = 1;
  public FinalT6A(int x, int p){
    temp+=1;
    y = temp - p;
    sum = temp + x;
    System.out.println(x + " " + y+ " " + sum);
  }
  public void methodA(){    
    int x=0, y =0;
    y = y + this.y; 
    x = this.y + 2 + temp;
    sum = x + y + methodB(temp, y);
    System.out.println(x + " " + y+ " " + sum);
  }
  public int methodB(int temp, int n){
    int x = 0;
    y = y + (++temp);
    x = x + 3 +  n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);  
    return sum;
  }
}

