package com.moviesorter;

import java.util.ArrayList;
import java.util.Collections;

public class MovieSorterMain {
    public static void main(String[] args) {
        // Create a list of movies
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("The Shawshank Redemption", 9.3, 1994));
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));

        // Sorting movies by year
        Collections.sort(movies);

        // Display sorted movies
        System.out.println("Movies sorted by release year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
