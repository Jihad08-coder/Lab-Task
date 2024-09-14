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

abstract class Member {
    private String name;
    private String memberID;
    protected ArrayList<Book> borrowedBooks;

    public Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberID() {
        return memberID;
    }

    public abstract int getBorrowLimit(); // Abstract method for borrowing limit

    public abstract void borrowBook(Book book);

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            System.out.println(name + " returned " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow this book.");
        }
    }

    public void printBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has no borrowed books.");
        } else {
            System.out.println(name + "'s borrowed books:");
            for (Book book : borrowedBooks) {
                System.out.println(book);
            }
        }
    }
}

