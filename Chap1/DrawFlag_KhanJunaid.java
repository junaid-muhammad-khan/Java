//////////////////////////////////////////////////////////////////////////////////////////
// Course: INFO 2313: Program Structure & Design II (S50) 
// Last Name: Khan
// First Name: Junaid Muhammad
//
// Student ID: 100484067
// file: Drawflag_KhanJunaid.java
// description: A Java program that draws a custom striped flag pattern using loops.
//////////////////////////////////////////////////////////////////////////////////////////

public class DrawFlag_KhanJunaid {
    public static void main(String[] args) {
        drawFlag();
    }

    public static void drawFlag() {
        System.out.println("Custom Striped Flag Pattern:");
        
        // Loop for the top part
        for (int i = 1; i <= 5; i++) {
            System.out.print("|");
            // Nested loop for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Nested loop for remaining spaces
            for (int k = 1; k <= (10 - 2 * i); k++) {
                System.out.print("=");
            }
            System.out.println("|");
        }

        // Loop for the bottom part
        for (int i = 1; i <= 3; i++) {
            System.out.print("|");
            for (int j = 1; j <= 10; j++) {
                System.out.print("=");
            }
            System.out.println("|");
        }
        
        // Bottom part
        System.out.println(" ----------");
    }
}