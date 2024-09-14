
package com.mycompany.bookarraylinkedlist;

import java.util.ArrayList;


public class Bookarraylinkedlist {

   String title;
    String author;
    int year;
    String genre;

    
    public Bookarraylinkedlist (String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    
    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year: " + this.year);
        System.out.println("Genre: " + this.genre);
        System.out.println();
    }

  
    public static void main(String[] args) {
        
        ArrayList<Bookarraylinkedlist> bookList = new ArrayList<>();

 
        Bookarraylinkedlist  book1 = new Bookarraylinkedlist ("Dune","Frank Herbert",2021,"science Fiction");
        Bookarraylinkedlist  book2 = new Bookarraylinkedlist ("Neuromancer","author",2022,"science Fiction");
        Bookarraylinkedlist  book3 = new Bookarraylinkedlist ("The Left Hand of Darkness","Ursula K. Le Guin",2020,"science Fiction");

       
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

    
        System.out.println("Books in the list:");
        for (Bookarraylinkedlist  book : bookList) {
            book.display();
        }

     
        bookList.remove(book2);

      
        System.out.println("Books in the list after removal:");
        for (Bookarraylinkedlist book : bookList) {
            book.display();
        }
    }
}

