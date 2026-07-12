// This program shows how to use String object.


public class StringExample
{
	public static void main(String args[])
	{
		String summerMovie01 = "Transformer";
		String summerMovie02 = "Pirates of Carribean";
		String summerTopMovie = summerMovie01 + summerMovie02;
		char ch01 = summerMovie01.charAt(0);
		
		int lenMovie01 = summerMovie01.length();
		int lenMovie02 = summerMovie02.length();
		
		System.out.println("Summer movie fun!! Count the number of characters of movie titles.\n");
		System.out.println(summerMovie01 + " has " + lenMovie01 + " letters");
		System.out.println(summerMovie02 + " has " + lenMovie02 + " letters");
		System.out.println("Compare the length of strings: Do they have the same length? " + (lenMovie01 == lenMovie02));
		System.out.println("Total length:" + (lenMovie01 + lenMovie02));
		System.out.println("First character of 'Transformer' is " + ch01);
		System.out.println("Third character from the last letter of 'Transformer' is " + summerMovie01.charAt(lenMovie01 - 3));
		System.out.println("Combine two strings:" + summerTopMovie);
		
		
	}
}