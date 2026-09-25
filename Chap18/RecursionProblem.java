
import java.util.Scanner; 

public class RecursionProblem {
  public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Enter message: ");
		  String userMessage = input.nextLine();
		  
		  System.out.println("How many times should the message be printed");
		  int nTimes = input.nextInt();
		  
		  //nprintln(userMessage,nTimes);
		  
		  for(int n = 0 ; n < nTimes ; n++) {
			  System.out.println(userMessage);
		  }
		  
	  }

  
  public static void nprintln(String message, int n) {
	  if(n >= 1) {
		  System.out.println(message);
		  nprintln(message, n-1);
	  }
	  
  }
}
