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

public class Library {
    private List<Bookss> books;
    private List<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Bookss book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println("Added member: " + member.getName());
    }

    public void issueBook(Member member, Bookss book) {
        member.borrowBookss(book);
    }

    public void returnBook(Member member, Bookss book) {
        member.returnBook(book);
    }

    public void searchBook(String title) {
        for (Bookss book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
                return;
            }
        }
        System.out.println("Book not found.");
    }
}

