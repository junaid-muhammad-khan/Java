//////////////////////////////////////////////////////////////////////////////////////////
// Course: INFO 2313: Program Structure & Design II (S50) 
// Last Name: Khan
// First Name: Junaid Muhammad
//
// Student ID: 100484067
// file: Survey42_K.java
// description: This program conducts a survey to determine game players' preferences 
//              among different console devices. It collects a set number of votes, 
//              calculates totals for each platform, and identifies the winner or 
//              detects ties based on the final results.
//////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class Survey42_K {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Video Game Platform Survey...");
        
        // 1. Get number of participants
        System.out.print("Enter the number of participants: ");
        int participants = input.nextInt();
        
        // 2. Initialize vote counters
        int pc = 0, xbox = 0, ps = 0;
        
        System.out.println("Enter your preference!");
        System.out.println("'1' for PC, '2' for XBox, '3' for Playstation.");
        
        // 3. Voting Loop
        for (int i = 1; i <= participants; i++) {
            System.out.print("Participant #" + i + ", Enter your favourite platform: ");
            int vote = input.nextInt();
            
            if (vote == 1) pc++;
            else if (vote == 2) xbox++;
            else if (vote == 3) ps++;
            else System.out.println("Invalid vote. Skipping...");
        }
        
        // 4. Display Summary
        System.out.println("\nWho wins the console wars?");
        System.out.println("Total participants: " + participants);
        System.out.println("PC: " + pc + " XBox: " + xbox + " Playstation: " + ps);
        
        // 5. Determine Results (Winner or Ties)
        if (pc > xbox && pc > ps) {
            System.out.println("Gabe Newell (PC) wins by " + (pc - Math.max(xbox, ps)) + " more vote(s)!");
        } else if (xbox > pc && xbox > ps) {
            System.out.println("Xbox wins!");
        } else if (ps > pc && ps > xbox) {
            System.out.println("Kazuo Hirai (Playstation) wins!");
        } else if (pc == xbox && pc == ps) {
            System.out.println("A three way tie!");
        } else if (pc == xbox) {
            System.out.println("PC and Xbox tied with " + pc + " votes each.");
        } else if (pc == ps) {
            System.out.println("PC and Playstation tied with " + pc + " votes each.");
        } else if (xbox == ps) {
            System.out.println("Xbox and Playstation tied with " + xbox + " votes each.");
        }
    }
}