/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookss;




    public class Bookss {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Bookss(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }
  
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        Bookss book1 = new Bookss("The Great Gatsby", "F. Scott Fitzgerald", "ISBN001");
        Bookss book2 = new Bookss("Moby Dick", "Herman Melville", "ISBN002");
        library.addBook(book1);
        library.addBook(book2);

        // Adding members
        Student student = new Student("Alice", "ST001");
        Teacher teacher = new Teacher("Mr. Smith", "TE001");
        library.addMember(student);
        library.addMember(teacher);

        // Borrowing books
        library.issueBook(student, book1);
        library.issueBook(teacher, book2);

        // Trying to borrow more than allowed
        library.issueBook(student, book2); // Should fail due to book availability

        // Returning books
        library.returnBook(student, book1);
        library.returnBook(teacher, book2);

        // Searching for a book
        library.searchBook("The Great Gatsby");
        library.searchBook("Nonexistent Book");
    }
}




