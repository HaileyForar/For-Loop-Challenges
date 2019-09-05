import java.util.Scanner;

public class ForLoopChallenges
	{

		public static void main(String[] args)
			{
//				printDonuts();
//				ascendAndDecsend();
//				printMultiples();
//				addingTotals();
//				addLowerboundAndUpperbound();
				drawRectangle();
//				extraCredit();

			}

		private static void printDonuts()
			{
				for(int i = 1; i <= 5; i++)
					{
						System.out.println("I love donuts");
					}
				
			}

		private static void ascendAndDecsend()
			{
				for(int i = 1; i <= 5; i++)
					{
						System.out.println(i);
					}
				
				for(int i = 5; i >= 1; i--)
					{
						System.out.println(i);
					}
				
			}

		private static void printMultiples()
			{
				for(int i = 5; i <= 100; i = i + 5)
					{
						System.out.println(i);
					}
				
			}

		private static void addingTotals()
			{
				int sum = 0;
				for(int i = 5; i <= 100; i = i + 5)
					{
						sum += i;
						System.out.println("The sum of all the multiples of 5 to 100 is " + sum);
					}
				
			}

		private static void addLowerboundAndUpperbound()
			{
				Scanner userInput = new Scanner (System.in);
				int numberEntered = userInput.nextInt();
				System.out.println("Please enter a number");
				
				Scanner userInput1 = new Scanner (System.in);
				int numberEntered1 = userInput.nextInt();
				System.out.println("Please enter another number");
				
				int sum = 0;
				
				
				
				
				
			}

		private static void drawRectangle()
		{
			
			int rows = 9;
			int cols = 9;
	 
			for (int i = 1; i <= rows; i++)
			{
				
			for (int j = 1; j <= cols; j++) 	
			{
				
			if (i != 1 && i != rows) 	
			{
				
			if (j == 1 || j == cols) 	
			{
				
			System.out.print("*");
			
			} 
			
			else 
			{
			System.out.print(" ");
			}
			
			}
			
			else 
			{
				
			System.out.print("*");
			
			}
			
			}
			
			if (i != rows) 
			{
				
			System.out.println();
			
			}
			
			}
			
		}
		  

		private static void extraCredit()
			{
				// TODO Auto-generated method stub
				
			}

	}
