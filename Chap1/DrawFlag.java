// Demo using for loop.
//
// 

public class DrawFlag
{
	public static void main(String[] args)
	{
		//using inner loop to create row and column
		for (int row=1; row<=3; row++)
		{
			for (int column=1; column<=7; column++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//testing some drawings
		for(int x=1; x<=5; x++)
		{
			for(int y=1; y<= x*2; y++)
			{
				System.out.print("^" + " ");
			}
		System.out.println();
		}
		
		for(int a=6; a>=1; a--)
		{
			for(int b=a; b>=1; b--)
			{
				System.out.print("@");
			}
			System.out.print(" ");
			for(int z=a; z>=1; z--)
			{
				System.out.print("/-" + "<>-" + "\\ ");
			}
		System.out.println("*");
		}
	
		//Drawing a flag using for loop
		System.out.println("\nThis is French flag!!");
		for (int c=1; c<=3; c++)
		{
			System.out.print(" ");
			for (int d=1; d<= 4; d++)
			{
				System.out.print("_");
			}
		}
		
		System.out.println();

		for(int e=1; e<=3; e++)
		{
			for (int f=1; f<=3; f++)
			{
				System.out.print("|");
				for (int g=1; g<= 4; g++)
				{
					System.out.print(" ");
					
				}
			
			}
			System.out.print("|");
			System.out.println();
		}

		for (int h=1; h<=3; h++)
		{
			System.out.print("|");
			for (int i=1; i<= 4; i++)
			{
				System.out.print("_");
					
			}
		}
		System.out.print("|");
	}
}