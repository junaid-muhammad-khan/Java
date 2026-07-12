//////////////////////////////////////////////////////////////////////////////////////////
// Course: INFO 2313: Program Structure & Design II (S50) 
// Last Name: Khan
// First Name: Junaid Muhammad
//
// Student ID: 100484067
// file: MovieBase_KhanJ.java
// description: This class defines the Movie object with private attributes for title, 
//              director, rating, and genre. It contains a constructor to initialize 
//              these values, a method to check and boost audience ratings using a 
//              while loop, and a method to display a movie quote.
//////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class MovieBase_KhanJ { 
    
    // These variables belong to the object. Every 'Movie' we create has its own copy of these.
    // 'private' means other classes cannot access them directly.
    private String title;
    private String director;
    private int rating; 
    private String genre;

    public MovieBase_KhanJ(String t, String d, int r, String g) {
        // Assigning the temporary parameters (t, d, r, g) to the permanent class variables
        title = t;
        director = d;
        rating = r;
        genre = g;
        
        System.out.println("TITLE: " + title + " | DIRECTOR: " + director + " | RATING: " + rating + " | GENRE: " + genre);
    }

    public void checkAudienceScore(int currentScore) {
        
        int score = currentScore;
        int threshold = 90; // The goal: Movie needs a 90 to be a "Blockbuster"
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Current Audience Score = " + score);

        // Loop: Keep asking for more reviews until score >= 90
        while (score < threshold) {
            System.out.println(title + " needs better reviews to be a hit!");
            System.out.print("Add marketing boost points: ");
            
            int points = input.nextInt();
            score = score + points; // Update the variable
            
            System.out.println("Updated Score = " + score);
        }
        
        System.out.println("Certified Fresh! This movie is a Blockbuster.\n");
    }

    public void playMovieQuote() {
        System.out.println("Playing famous line from " + title + "...");
        System.out.println("The audience cheers for this " + genre + " masterpiece!");
        System.out.println();
    }

    // Helper method to let the main program see the title
    public String getTitle() {
        return title;
    }
}