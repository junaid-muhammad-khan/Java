//////////////////////////////////////////////////////////////////////////////////////////
// Course: INFO 2313: Program Structure & Design II (S50) 
// Last Name: Khan
// First Name: Junaid Muhammad
//
// Student ID: 100484067
// file: randomGuess41_K.java
// description: This program generates a random integer within a user-defined range. 
//              It prompts the user to guess the number within a specified number of 
//              trials, provides feedback on incorrect guesses, and validates that 
//              input remains within the chosen minimum and maximum bounds.
//////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.util.Random;

public class randomGuess41_K {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("<<<--- Guess a number! --->>>"); 

        // 1. Get range from user
        System.out.print("Enter a minimum value: "); 
        int min = input.nextInt();
        System.out.print("Enter a maximum value: "); 
        int max = input.nextInt();

        // 2. Get number of trials
        System.out.print("How many chances do you need? "); 
        int totalChances = input.nextInt();
        
        // 3. Generate target number 
        int target = rand.nextInt(max - min + 1) + min;
        
        int attemptsUsed = 0;
        boolean won = false;

        // 4. Game Loop 
        while (attemptsUsed < totalChances) {
            System.out.print("Enter your number between " + min + " and " + max + ": ");
            int guess = input.nextInt();

            // Check if in range 
            if (guess < min || guess > max) {
                System.out.println("Out of range. Re-enter your guess.");
                continue; 
            }

            attemptsUsed++;

            if (guess == target) {
                System.out.println("You got it!");
                won = true;
                break; // End program when correct 
            } else {
                System.out.println("Wrong");
            }
        }

        if (!won) {
            System.out.println("You already used " + totalChances + " chances");
        }
        System.out.println("The right answer is " + target); 
    }
}