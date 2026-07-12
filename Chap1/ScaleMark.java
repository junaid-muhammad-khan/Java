// You will modify this program to show the ranges of different grades.

import java.io.*;
  
public class ScaleMark{
  
  public static void main (String[] args){
    InputStreamReader stdin = new InputStreamReader(System.in);
    BufferedReader bfReader = new BufferedReader(stdin);
    
    int mark;
    String grade;
    String mark_input;
    
    try {
      System.out.println ("Enter your mark: ");
      mark_input = bfReader.readLine();
      mark = Integer.parseInt(mark_input);
      
      ScaleMark smObj = new ScaleMark();
      grade = smObj.scale(mark);
      System.out.println("Your final grade is: " + grade);
    } catch (java.io.IOException e) {
      System.out.println(e);
    }
      
  }
    
  
  public String scale(int aMark){
    String grade = null;

    return grade;
  }
}
    