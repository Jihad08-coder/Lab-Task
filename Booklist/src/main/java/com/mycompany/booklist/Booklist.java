
package com.mycompany.booklist;




    public class Booklist {
    private String title;
    private String author;
    private int year;
    private String genre;
    
    

public Booklist(String title,String author,int year,String genre){
    this.title=title;
    this.year=year;
    this.author=author;
    this.genre=genre;
}

public void display(){
    System.out.println("Title"+title);
    System.out.println("author"+author);
    System.out.println("year"+year);
   System.out.println("genre"+genre);
    System.out.println();

}
public static void main(String[] args) {
    Booklist[]books=new Booklist[3];
   books[0]=new Booklist("Dune","Frank Herbert",2021,"science Fiction");
   books[1]=new Booklist("Neuromancer","author",2022,"science Fiction");
   books[2]=new Booklist("The Left Hand of Darkness","Ursula K. Le Guin",2020,"science Fiction");
    System.out.println("Books Informations:");
    for(Booklist book:books){
        book.display();
    }
    books[1]=null;
    System.out.println("book info after removing an object:");
    for(Booklist book: books){
        if(book!=null){
            book.display();
        }
    }
}
  
        
}


