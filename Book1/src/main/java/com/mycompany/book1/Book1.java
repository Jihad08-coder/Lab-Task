/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.book1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class Book1 {
    
    private String title;
    private String author;
    private int year;


    private static String genre;
    private static int bookcnt = 0;

    
    public Book1(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        bookcnt++;
    }

    
    public void display() {
        System.out.println("Title of the book: " + title);
        System.out.println("Author name: " + author);
        System.out.println("release Year : " + year);
        System.out.println("Genre: " + genre);
    }

    
    public static void display_Total_Books() {
        System.out.println("Total number of books: " + bookcnt);
    }

   
    public static void sGenre(String genre) {
        Book1.genre = genre;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the genre for all books: ");
        String genreInput = scanner.nextLine();
        Book1.sGenre(genreInput);

      
        System.out.println("Enter details for the book:");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();

        
        Book1 book = new Book1(title, author, year);

      
        System.out.println("\nBook Details:");
        book.display();

      
        System.out.println();
        Book1.display_Total_Books();

        scanner.close();
    }
}
