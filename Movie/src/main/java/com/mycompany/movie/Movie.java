/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movie;

/**
 *
 * @author LENOVO
 */
public class Movie {

    // Properties of the movie
    private String title;
    private String genre;
    private String lead_actor;
    private String director;
    private int releaseYear;
    private double rating;
    private String review;

    // Constructor 
    public Movie(String title, String genre, String lead_actor, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.lead_actor = lead_actor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        setReview();  // Set the review based on the rating
    }

    // Method of ratting 
    private void setReview() {
        if (this.rating < 5) {
            this.review = "Not Good";
        } else {
            this.review = "Good";
        }
    }

    //  display the movie properties
    public void displayMovieDetails() {
        System.out.println("Title of the movie: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Actor of the movie: " + lead_actor);
        System.out.println("Director of the movie: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + review);
        System.out.println();
    }
    

    public static void main(String[] args) {
         // Main method to create objects and display their properties
   
        // Create objects of the Movie class
        Movie movie1 = new Movie("Gigli", "Romantic Comedy,Crime","Ben Affleck"," Martin Brest",2003, 2.6);
        Movie movie2 = new Movie("intersteller", "science fiction","Matthew McConaughey","Christopher Nolan", 2014, 8.6);

        // Display the properties of the movies
        System.out.println("Movie 1 Details:");
        movie1.displayMovieDetails();

        System.out.println("Movie 2 Details:");
        movie2.displayMovieDetails();
    }
}
    
        
    

