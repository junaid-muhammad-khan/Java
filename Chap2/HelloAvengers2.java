/////////////////////////////////////////////////
// Course:
// Last Name:
// First Name:
// Student ID:
//
// File: HelloAvengers2.java
// Summary: This class is to test AvengersX class.
/////////////////////////////////////////////////

public class HelloAvengers2
{
	public static void main (String args[ ])
	{
		
		AvengersX ironman = new AvengersX("Tony Stark") ;
		AvengersX hulk = new AvengersX("Bruce Banner") ;
		System.out.println(ironman);
		System.out.println(hulk);
		
		System.out.println( ironman.getName());
		
		String hulk_realName = hulk.getName();
		System.out.println(hulk_realName);
		
		System.out.println("----------");
		
		hulk = ironman;
		System.out.println("ironman" + ironman +"," + "hulk:" + hulk);
		System.out.println(hulk_realName);	
		System.out.println(hulk.getName());
		
		System.out.println("----------");
		int memberAll = hulk.totalMembers();
		System.out.println(memberAll);
		System.out.println(hulk.totalMembers());
		
	}
}
