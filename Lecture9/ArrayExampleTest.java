/* 
 ArrayExample.java
 Reference: 
   1. Java Foundation by JohnLewis
   2. Introduction to Java PProgramming by Y. Daniel Liang
   3. Object-oriented in Java and C++ by Avinash Kak
*/

import java.util.Scanner;

public class ArrayExampleTest {
 
  public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
    final int ARRAY_SIZE = 4;
    double[] array01 = new double[ARRAY_SIZE];

    System.out.print("Enter " + ARRAY_SIZE + " different numbers: \n");
    
    // Using for loop to read all numbers entered by a user
    for (int i = 0; i < array01.length; i++) {
    	System.out.print("Enter a number " + (i+1) + ": ");
    	array01[i] = userInput.nextDouble();
    }
    
    //Output all numbers
    System.out.print( "The array is ");
    for (int i = 0; i < array01.length; i++) {
    	System.out.print(array01[i] + "  ");
    }
    
    // Swap numbers
    double temp = array01[0];
    array01[0] = array01[array01.length-1];
    array01[array01.length-1] = temp;
    
    System.out.print( "\nAfter swap the first and the last elements, the updated array is  ");
    for (int i = 0; i < array01.length; i++) {
    	System.out.print(array01[i] + "  ");
    }

    // To find the largest number,assign array01[0] to 'max' variable. Compare and update.
    double max = array01[0];
    for (int i = 1; i < array01.length; i++) {
      if (max < array01[i])
        max = array01[i];
    }
    System.out.println("\n\nThe largest number is " + max);
    
    
    // Copying arrays
    double[] copiedArray = new double[array01.length];
    System.out.print( "\nAfter copying array01, copiedArray also becomes ");
    for (int i = 0; i < array01.length; i++) {
    	copiedArray[i] = array01[i];
    	System.out.print(copiedArray[i] + "  ");
      }
    
    System.out.print("\n\nSelection sorting applied on copiedArray. Result: " );
    selectionSort(copiedArray);
    printList(copiedArray);
    
    // Swap through calling methods
    System.out.print( "\n\nAfter calling swapByValue(), does array01[0] and array01[3] actually swapped? ");
    swapByValue(array01[0],array01[3] );
    for (int i = 0; i < array01.length; i++) {
    	System.out.print(array01[i] + "  ");
      }
    
    System.out.print( "\n\nTry calling swapByReference(), ");
    swapByReference(array01 );
    for (int i = 0; i < array01.length; i++) {
    	System.out.print(array01[i] + "  ");
      }
    
    // Return type is an array
    System.out.print( "\n\nTry calling areaCircle(), \n");
    double[] circles = areaCircle(array01 );
    for (int i = 0; i < array01.length; i++) {
    	System.out.println("circles["+i+"]:"+circles[i] + " ");
      }
    
    // Calling linear search
    System.out.print( "\n\nCalling linearSearch(); enter a number to find out whether this number is in the array: \n");
    double key01 = userInput.nextDouble();    
    int found01 = linearSearch(array01, key01);
    System.out.print("If found, returing the correct index. If not, display -1. Result: " );
    System.out.println(found01 );
    
    // Calling binary search
    System.out.print( "\n\nCalling binarySearch(); enter a number to find out whether this number is in the array: \n");
    double key02 = userInput.nextDouble();    
    int found02 = binarySearch(array01, key02);
    System.out.print("If found, returing the correct index. If not, display -1. Result: " );
    System.out.println(found02 );
    
    
    //insertionSort applied
    System.out.print("\nInsertion sorting applied. Result: " );
    insertionSort(array01);
    printList(array01);
    
    
  }

  
  
  //-------------------- Methods definitions
  
    /** Swap two variables */
    public static void swapByValue(double n1, double n2) {
      double temp = n1;
      n1 = n2;
      n2 = temp;
    }

    /** By passing an array as an argument, swapping elements in the array */
    public static void swapByReference(double[] array) {
    	Scanner swapInput = new Scanner(System.in); 
    	System.out.print("\nEnter a source index number: ");
    	int source = swapInput.nextInt();
    	System.out.print("Enter a target index number: ");
    	int target = swapInput.nextInt();
    	
    	double temp = array[source];
    	array[source] = array[target];
    	array[target] = temp;
    }
    
    //Return type as an array
	public static double[] areaCircle(double[] array)
	{
		double[] arrayCircles = new double[array.length];

	    for (int i = 0; i < arrayCircles.length; i++) {
	    	arrayCircles[i] = (Math.PI)*array[i]*array[i];
	      }

		return arrayCircles;
	}
	
	//linear search
	  public static int linearSearch(double[] list, double key) {
		    for (int i = 0; i < list.length; i++)
		    {
		      if (key == list[i])
		        return i;
		    }
		    return -1;
		  }
    
	  //binary search
	  public static int binarySearch(double[] list, double key) {
		    int low = 0;
		    int high = list.length - 1;

		    while (high >= low) {
		      int mid = (low + high) / 2;
		      if (key < list[mid])
		        high = mid - 1;
		      else if (key == list[mid])
		        return mid;
		      else
		        low = mid + 1;
		    }
		    return  - 1;
		   
		  }
	  
	  //selection sort
	  static void selectionSort(double[] list) {
		    for (int i = list.length - 1; i >= 1; i--) {
		      // Find the maximum in the list[0..i]
		      double currentMax = list[0];
		      int currentMaxIndex = 0;

		      for (int j = 1; j <= i; j++) {
		        if (currentMax < list[j]) {
		          currentMax = list[j];
		          currentMaxIndex = j;
		        }
		      }

		      // Swap list[i] with list[currentMaxIndex] if necessary;
		      if (currentMaxIndex != i) {
		        list[currentMaxIndex] = list[i];
		        list[i] = currentMax;
		      }
		    }
		  }
	  
	  // Insertion sort

	  /** The method for sorting the numbers */
	  public static void insertionSort(double[] list) {
	    for (int i = 1; i < list.length; i++) {
	      /** insert list[i] into a sorted sublist list[0..i-1] so that
	           list[0..i] is sorted. */
	      double currentElement = list[i];
	      int k;
	      for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
	        list[k + 1] = list[k];
	      }

	      // Insert the current element into list[k+1]
	      list[k + 1] = currentElement;
	    }
	  }
	  
	  // print an array
	  static void printList(double[] list) {
		    for (int i = 0; i < list.length; i++)
		      System.out.print(list[i] + "  ");
		    System.out.println();
		  }
	  
}
   