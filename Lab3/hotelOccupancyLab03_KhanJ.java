//////////////////////////////////////////////////////////////////////////////////////////
// Course: INFO 2313: Program Structure & Design II (S50) 
// Last Name: Khan
// First Name: Junaid Muhammad
//
// Student ID: 100484067
// file: hotelOccupancyLab03_KhanJ.java
// description: This program calculates the occupancy rate for a hotel. It prompts 
//              the user for the number of floors, total rooms, and occupied rooms 
//              per floor. It validates input to ensure data integrity and generates 
//              a formatted text file (OccupancyReport_KhanJ.txt) displaying the 
//              floor wise breakdown and overall occupancy statistics.
//////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

public class hotelOccupancyLab03_KhanJ {
    public static void main(String[] args) {
        
        // Use a try-catch block to handle the FileNotFoundException required for File I/O
        try {
            // Create Scanner for user input 
            Scanner keyboard = new Scanner(System.in);
            
            // Create PrintWriter to generate the output file
            String outputFilename = "OccupancyReport_KhanJ.txt";
            PrintWriter outputFile = new PrintWriter(outputFilename);
            
            // 1. Ask user for number of floors 
            int floors;
            while (true) {
                System.out.print("How many floors does the hotel have? ");
                floors = keyboard.nextInt();
                
                // Validation: Must not accept value less than 1 
                if (floors >= 1) {
                    break;
                }
                System.out.println("Invalid. Enter 1 or more.");
            }	
            
            // Write the table header to the file first 
            outputFile.println("Hotel Occupancy Report");
            outputFile.println("Floor\tRooms\tOccupied rooms");
            
            // Initialize accumulators for totals 
            int totalRooms = 0;
            int totalOccupied = 0;
            
            // 2. Loop through each floor to get data
            for (int i = 1; i <= floors; i++) {
                // a. Ask for rooms on this floor
                int roomsOnFloor;
                while (true) {
                    System.out.print("How many rooms does floor " + i + " have? ");
                    roomsOnFloor = keyboard.nextInt();
                    
                    // Do not accept number less than 10
                    // (Matches sample output error message: "Invalid. Enter 10 or more")
                    if (roomsOnFloor >= 10) {
                        break;
                    }
                    System.out.print("Invalid. Enter 10 or more: ");
                }
                
                // b. Ask for occupied rooms on this floor
                System.out.print("How many occupied rooms does floor " + i + " have? ");
                int occupiedOnFloor = keyboard.nextInt();
                
                // Add to totals
                totalRooms += roomsOnFloor;
                totalOccupied += occupiedOnFloor;
                
                // Write this floor's data to the file immediately 
                outputFile.println(i + ".\t\t" + roomsOnFloor + "\t\t" + occupiedOnFloor);
            }
            
            // 3. Calculate results
            int totalVacant = totalRooms - totalOccupied;
            double occupancyRate = 0.0;
            
            if (totalRooms > 0) {
                // Formula: Number of rooms occupied / Total number of rooms
                occupancyRate = (double) totalOccupied / totalRooms;
            }
            
            // 4. Display totals to Console
            System.out.println("\nNumber of rooms: " + totalRooms);
            System.out.println("Occupied rooms: " + totalOccupied);
            System.out.println("Vacant rooms: " + totalVacant);
            System.out.printf("Occupancy rate: %.2f%%\n", occupancyRate * 100);
            System.out.println("Report written to " + outputFilename + ".");
            
            // 5. Write totals to the Output File
            outputFile.println("Total\t" + totalRooms + "\t\t" + totalOccupied);
            outputFile.println("Vacant rooms: " + totalVacant);
            outputFile.printf("Occupancy rate: %.2f%%", occupancyRate * 100);
            
            // Close the file and scanner
            outputFile.close();
            keyboard.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error creating the file.");
        }
    }
}