/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccount;

/**
 *
 * @author LENOVO
 */
public class Bankaccount {

    private String account_num;
    private double balance;

    // Constructor 
    public Bankaccount(String account_num, double balance) {
        this.account_num = account_num;
        this.balance = balance;
    }

    // deposit money method
    public void deposit(double amount) {
        if (amount > 0) {
            balance =balance + amount;
            System.out.println("Deposited $" + amount + ". New balance of account is $" + balance + ".");
        } else {
            System.out.println("Deposit amount of money should be positive.");
        }
    }

    // withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance =balance - amount;
                System.out.println("Withdrew money is $" + amount + ". New balance of account $" + balance + ".");
            } else {
                System.out.println("The fund is Insufficient.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    public static void main(String[] args) {
        // Create objects of BankAccount
        Bankaccount account = new Bankaccount("17598", 1500);
        System.out.println("Current Balance is 1500");

        // Perform deposit operations
        account.deposit(350);  
          

        // Perform withdrawal operations
        account.withdraw(220);  
         
    }
}

