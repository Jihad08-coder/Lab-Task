/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookss;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.List;

public abstract class Member {
    protected String name;
    protected String memberID;
    protected List<Bookss> borrowedBookss;

    public Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
        this.borrowedBookss = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberID() {
        return memberID;
    }

    public List<Bookss> getBorrowedBookss() {
        return borrowedBookss;
    }

    public abstract void borrowBookss(Bookss book);

    public void returnBook(Bookss book) {
        if (borrowedBookss.contains(book)) {
            borrowedBookss.remove(book);
            book.setAvailable(true);
            System.out.println(name + " returned the book: " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow this book.");
        }
    }
}

