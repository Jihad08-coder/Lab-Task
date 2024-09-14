/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookss;

/**
 *
 * @author LENOVO
 */
public class Student extends Member {
    private static final int BORROW_LIMIT = 5;

    public Student(String name, String memberID) {
        super(name, memberID);
    }

    @Override
    public void borrowBookss(Bookss book) {
        if (borrowedBookss.size() < BORROW_LIMIT && book.isAvailable()) {
            borrowedBookss.add(book);
            book.setAvailable(false);
            System.out.println(name + " (Student) borrowed the book: " + book.getTitle());
        } else if (!book.isAvailable()) {
            System.out.println("Book is not available.");
        } else {
            System.out.println(name + " has reached the borrowing limit of " + BORROW_LIMIT + " books.");
        }
    }
}

