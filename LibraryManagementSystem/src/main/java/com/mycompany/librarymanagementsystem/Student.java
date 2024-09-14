/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Scanner;

class Student extends Member {
    private static final int BORROW_LIMIT = 5;

    public Student(String name, String memberID) {
        super(name, memberID);
    }

    @Override
    public int getBorrowLimit() {
        return BORROW_LIMIT;
    }

    @Override
    public void borrowBook(Book book) {
        if (borrowedBooks.size() < BORROW_LIMIT && book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(getName() + " borrowed " + book.getTitle());
        } else if (!book.isAvailable()) {
            System.out.println(book.getTitle() + " is not available.");
        } else {
            System.out.println(getName() + " has reached the borrow limit.");
        }
    }
}