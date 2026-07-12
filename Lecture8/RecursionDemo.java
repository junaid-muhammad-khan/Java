
public class RecursionDemo {

	public static void main(String[] args) {
		
		
		 //hello(); // recursive hello()
		
		 //countdownFor(5);
		 
		///*
		 System.out.println("Blast-off by Recursive approach without loop!");
		 countdownRecursive(5);  
		 //*/	

		/*
		int result_Factorial =  factorialRecursion(5);
		System.out.println("Factorial result: "+ result_Factorial + "\n");
		*/
		
		/*
		int resultGCD =gcdRecursion(27, 18);
		System.out.println("GCD result: "+ resultGCD);
		 */
	}


	public static void hello(){
		  System.out.println("Hello");
		  hello();
	}
	
	public static void countdownFor(int times){
		  for(int counter = times; counter >= 0; counter--)
			  System.out.println("countdown: " + counter);
		  System.out.println("Blast-off by for loop! \n");
	}

	public static void countdownRecursive(int times){
		  System.out.println("countdown: " + times);
		  if(times > 0){
			  countdownRecursive(times-1);
		  }		  
		  // System.out.println("countdown:	 " + times);
	}
	
	public static int factorialRecursion(int n){  		  
		  if(n == 0)
		    return 1;
		  else
		    return  n * factorialRecursion(n -1);
	}
	
	public static int gcdRecursion(int m, int n){  
		System.out.println(m + ", " + n);
		  if(n == 0)
		    return m;
		  else
		    return  gcdRecursion(n, m%n);
	}



}

