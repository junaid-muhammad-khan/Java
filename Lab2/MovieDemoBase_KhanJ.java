//////////////////////////////////////////////////////////////////////////////////////////
// Course: INFO 2313: Program Structure & Design II (S50) 
// Last Name: Khan
// First Name: Junaid Muhammad
//
// Student ID: 100484067
// file: MovieDemoBase_KhanJ.java
// description: This is the driver class containing the main method. It instantiates 
//              five MovieBase_KhanJ objects, runs an interactive rating check for 
//              each movie, and implements a menu-driven loop to allow the user to 
//              select movies and view their specific quotes.
//////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;

public class MovieDemoBase_KhanJ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating 5 distinct objects (instances) of the MovieBase_KhanJ class.
        // Format: ClassName VariableName = new Constructor(arguments);
        
        MovieBase_KhanJ m1 = new MovieBase_KhanJ("Inception", "Nolan", 88, "Sci-Fi");
        MovieBase_KhanJ m2 = new MovieBase_KhanJ("Titanic", "Cameron", 75, "Romance");
        MovieBase_KhanJ m3 = new MovieBase_KhanJ("The Godfather", "Coppola", 92, "Crime");
        MovieBase_KhanJ m4 = new MovieBase_KhanJ("Toy Story", "Lasseter", 60, "Animation");
        MovieBase_KhanJ m5 = new MovieBase_KhanJ("Jaws", "Spielberg", 80, "Thriller");

        System.out.println(); 

        // We call the method .checkAudienceScore() for each specific object variable.
        
        // Movie 1
        System.out.print("Enter current Rotten Tomatoes score for " + m1.getTitle() + ": ");
        int s1 = sc.nextInt(); // Declaration of local variable s1
        m1.checkAudienceScore(s1);

        // Movie 2
        System.out.print("Enter current Rotten Tomatoes score for " + m2.getTitle() + ": ");
        int s2 = sc.nextInt();
        m2.checkAudienceScore(s2);

        // Movie 3
        System.out.print("Enter current Rotten Tomatoes score for " + m3.getTitle() + ": ");
        int s3 = sc.nextInt();
        m3.checkAudienceScore(s3);
        
        // Movie 4
        System.out.print("Enter current Rotten Tomatoes score for " + m4.getTitle() + ": ");
        int s4 = sc.nextInt();
        m4.checkAudienceScore(s4);

        // Movie 5
        System.out.print("Enter current Rotten Tomatoes score for " + m5.getTitle() + ": ");
        int s5 = sc.nextInt();
        m5.checkAudienceScore(s5);

        System.out.println("------------------------------MOVIE QUOTE DEMO------------------------------");
        
        // Declaration of variable to control the loop
        int choice = 0;
        
        while (choice != 6) {
            System.out.println("Which movie quote do you want to hear? (1-5). Enter 6 to exit.");
            System.out.println("1) " + m1.getTitle());
            System.out.println("2) " + m2.getTitle());
            System.out.println("3) " + m3.getTitle());
            System.out.println("4) " + m4.getTitle());
            System.out.println("5) " + m5.getTitle());
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    m1.playMovieQuote();
                    break;
                case 2:
                    m2.playMovieQuote();
                    break;
                case 3:
                    m3.playMovieQuote();
                    break;
                case 4:
                    m4.playMovieQuote();
                    break;
                case 5:
                    m5.playMovieQuote();
                    break;
                case 6:
                    System.out.println("Exiting theater...");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}