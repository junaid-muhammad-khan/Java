public class ArrayPointer{
	public static void main(String args[]) {
		
		//int arrayX[]; //error		
		int arrayX[] = null;
		System.out.println("arrayX:" + arrayX);
		
		int arrayY[];
		
		//  arrayX = {1, 2, 3, 4, 5}; //Array constants can only be used in initializers //error
		arrayX = new int[5];
		System.out.println("After assign new int[5], arrayX: " + arrayX); //type-id@memory-address
		System.out.println("arrayX length: " + arrayX.length);
		System.out.println("arrayX[2]: " + arrayX[2]);		
		arrayX[2] = 7;
		printArray1D(arrayX);
		
		arrayY = arrayX;
		System.out.println("arrayY: " + arrayY + ", arrayX:" + arrayX); 
		printArray1D(arrayY);
		
		
		int arrayAlpha[] = {1, 2, 3};
		System.out.println("arrayAlpha: " + arrayAlpha); 
		printArray1D(arrayAlpha);
		arrayAlpha = arrayX;
		System.out.println("arrayAlpha: " + arrayAlpha);
		printArray1D(arrayAlpha);
		
		int arrayBeta[] = {4, 5, 6};
		arrayX = arrayBeta;
		System.out.println("arrayX:" + arrayX); 
		printArray1D(arrayX);
		System.out.println("arrayBeta:" + arrayBeta + ", arrayX: " + arrayX);
		
		double arrayD[] = {2.2, 3.3, 4.4};
		System.out.println("arrayD: " + arrayD); // [D
		
		double arrayDD[][] = {{1.1,2.2,3.3}, {4.4, 5.5, 6.6}};
		System.out.println("arrayDD: " + arrayDD); //[[D
		printArray2D(arrayDD);
		
		String sentence[][] = {{"Hello", "World"}, {"Stay", "healthy"}}; //[[L
		System.out.println(sentence);
	}
	
	public static void printArray1D(int[] x) {
		for (int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
		System.out.println("\n");
	}
	
	public static void printArray2D(double[][] x) {
		for (int i = 0; i < x.length; i++)
			for (int j = 0; j < x[i].length; j++)
				//for (int j = 0; j < x.length; j++) // Error, Exam, fix the error
			System.out.print(x[i][j] + " ");
		System.out.println("\n");
	}
	
	
	
}