import java.util.Scanner;

public class ForLoopChallenges
	{

		public static void main(String[] args)
			{
//				printDonuts();
//				ascendAndDecsend();
//				printMultiples();
//				addingTotals();
				addLowerboundAndUpperbound();
				drawRectangle();
				extraCredit();

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
				
			}

		private static void extraCredit()
			{
				// TODO Auto-generated method stub
				
			}

	}
