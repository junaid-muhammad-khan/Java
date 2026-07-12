/////////////////////////////////////////////////
// 
// Last Name:
// First Name: 
// Student ID:
// 
// File: Avengers.java
// Summary: A class for showing real name.
/////////////////////////////////////////////////

public class AvengersX
{
   private String trueIdentity;
    static int memberCount = 0;
	
   public AvengersX(String name)
   {
      trueIdentity = name;
      memberCount++;
    }    
   
   public String getName()
   {
	   return trueIdentity;
   }
   
   public static int totalMembers()
   {
	   return memberCount;
   }
   
}
