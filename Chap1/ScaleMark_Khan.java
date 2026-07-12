//////////////////////////////////////////////////////////////////////////////////////////
// Course: INFO 2313: Program Structure & Design II (S50) 
// Last Name: Khan
// First Name: Junaid Muhammad
//
// Student ID: 100484067
// file: Scalemark_Khan.java
// description: A Java program that scales numerical marks into letter grades.
//////////////////////////////////////////////////////////////////////////////////////////


import java.io.*;
  
public class ScaleMark_Khan {
  
  public static void main (String[] args) {
    InputStreamReader stdin = new InputStreamReader(System.in);
    BufferedReader bfReader = new BufferedReader(stdin);
    
    int mark;
    String grade;
    String mark_input;
    
    try {
      System.out.println("Enter your mark: ");
      mark_input = bfReader.readLine();
      mark = Integer.parseInt(mark_input);
      
      ScaleMark_Khan smObj = new ScaleMark_Khan();
      grade = smObj.scale(mark);
      System.out.println("Your final grade is: " + grade);
    } catch (java.io.IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("Please enter a valid integer.");
    }
  }
    
  public String scale(int aMark) {
    String grade;
    if (aMark >= 90) {
        grade = "A";
    } else if (aMark >= 80) {
        grade = "B";
    } else if (aMark >= 70) {
        grade = "C";
    } else if (aMark >= 60) {
        grade = "D";
    } else {
        grade = "F";
    }
    return grade;
  }
}