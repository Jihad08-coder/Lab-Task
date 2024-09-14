/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.librarymanagementsystem;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        System.out.println("List of Books(including title for search) are Available:");

        // Add sample books
        library.addBook(new Book("1984", "George Orwell", "1234567890"));
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", "978-0544003415"));
         library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "0987654321"));
          library.addBook(new Book("Pride and Prejudice", "Jane Austen", "978-1503290563"));
          System.out.println();
          
          System.out.println("Member of Library are added as teacher:");
        // Add sample members
        library.addMember(new Student("Kawser(serial num:S1) ", "S1"));
        library.addMember(new Teacher("Nironto(serial number S2)", "S2"));
         library.addMember(new Teacher("Jihad(serial no:S3", "S3"));
          library.addMember(new Teacher("sadia(serial no:S4)", "S4"));
          
           System.out.println();
          
           System.out.println("Member of Library are added as student:");
           
           library.addMember(new Student("sarif(serial no:S5)", "S5"));
           library.addMember(new Student("sarif(serial no:S6)", "S6"));
           library.addMember(new Student("sarif(serial no:S7)", "S7"));
           library.addMember(new Student("sarif(serial no:S8)", "S8"));
           library.addMember(new Student("sarif(serial no:S9)", "S9"));
           library.addMember(new Student("sarif(serial no:S10)", "S10"));
           
           
           
           
        while (true) {
            System.out.println("-----\nLibrary Management System------");
            System.out.println("1. Add Book in the library:");
            System.out.println("2. Search Book in the library:");
            System.out.println("3. Borrow Book from the library:");
            System.out.println("4. Return Book to the library:");
            System.out.println("5. View Borrowed Books");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.println("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    library.addBook(new Book(title, author, isbn));
                    break;

                case 2:
                    System.out.println("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();
                    Book book = library.searchBookByTitle(searchTitle);
                    if (book != null) {
                        System.out.println(book);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter member ID: ");
                    String memberID = scanner.nextLine();
                    Member member = library.searchMemberByID(memberID);
                    if (member != null) {
                        System.out.println("Enter book title to borrow: ");
                        String borrowTitle = scanner.nextLine();
                        Book bookToBorrow = library.searchBookByTitle(borrowTitle);
                        if (bookToBorrow != null) {
                            member.borrowBook(bookToBorrow);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter member ID: ");
                    memberID = scanner.nextLine();
                    member = library.searchMemberByID(memberID);
                    if (member != null) {
                        System.out.println("Enter book title to return: ");
                        String returnTitle = scanner.nextLine();
                        Book bookToReturn = library.searchBookByTitle(returnTitle);
                        if (bookToReturn != null) {
                            member.returnBook(bookToReturn);
                        } else {
                            System.out.println("Book not found.");
                        }
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 5:
                    System.out.println("Enter member ID: ");
                    memberID = scanner.nextLine();
                    member = library.searchMemberByID(memberID);
                    if (member != null) {
                        member.printBorrowedBooks();
                    } else {
                        System.out.println("Member not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice,try again.");
                    break;
            }
        }
    }
}

