import java.io.*;
import java.util.*;

public class Swap{
	public static void main(String[] args) {
		int a = 7;
		int b = 35;
		int c = 7;
		int d = 35;
		
	    a = b;
	    b = a;
	    
	    System.out.println(a + " " + b);

		//*
		int temp = c;
	    c = d;
	    d = temp;
	    System.out.println(c + " " + d);
	   // */
	}
	
}