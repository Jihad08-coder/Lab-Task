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

class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " added to the library.");
    }

    public void addMember(Member member) {
        members.add(member);
        System.out.println(member.getName() + " added to the library as a member.");
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Member searchMemberByID(String memberID) {
        for (Member member : members) {
            if (member.getMemberID().equalsIgnoreCase(memberID)) {
                return member;
            }
        }
        return null;
    }
}
