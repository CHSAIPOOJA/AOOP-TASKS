package com.moviesorter;

public class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getter methods
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    // Overriding compareTo method to sort movies by year
    @Override
    public int compareTo(Movie other) {
        return this.year - other.year; // Ascending order
    }

    // toString() method for printing
    @Override
    public String toString() {
        return name + " (" + year + ") - Rating: " + rating;
    }
}
