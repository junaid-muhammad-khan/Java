//////////////////////////////////////////////////////////////////////////////////////////
// Course: INFO 2313: Program Structure & Design II (S50) 
// Last Name: Khan
// First Name: Junaid Muhammad
//
// Student ID: 100484067
// file: Function_Khan.java
// description: A Java program that includes functions to add elements, find remainders, and calculate the area of a circle.
//////////////////////////////////////////////////////////////////////////////////////////

public class Function_Khan {
    public static void main(String args[]) {
        int x = 11;
        int y = 5;
            
        for (int i=0; i<3; i++)
            for (int j=0; j<3; j++) {
                System.out.println("Sum of i:" + i + " and j:" + j + " equals " + addElements(i,j));
            }
        
        System.out.println(x + " divide by " + y + " has a remainder of " + findRemainder(x,y));

        // New functionality for Part II
        double radius = 5.0;
        double area = areaCircle(radius);
        System.out.printf("The area of a circle with radius %.1f is %.2f\n", radius, area);
    }
    
    public static double areaCircle(double radius) {
        return Math.PI * radius * radius;  
    }
    
    public static int addElements(int a, int b) {
        return a + b;
    }
    
    public static int findRemainder(int c, int d) {
        return c % d;
    }
}