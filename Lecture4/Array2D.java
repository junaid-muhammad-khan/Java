// creating multidimensional array
//

class Array2D
{
	public static void main(String[] args)
	{
		int[][] array2D = {{0,1,2},{3,4,5},{6,7,8}};
		
		for (int row=0; row<array2D.length; row++)
		{
			for (int col=0; col<array2D[row].length+1; col++)
			{
							
				if (col<array2D[row].length)
				{
					System.out.print(array2D[row][col] + "\t");
				}
				else
					System.out.println();
			}
		}
	}
}
