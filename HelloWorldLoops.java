//A Calendar

/**
 * This class will go over the for loop and the while loop.  
 *
 */
import java.util.Scanner;

public class HelloWorldLoops 
{
	public static void main(String[] args) 
	{
		int numA;
		/**
		 *For loop.
		 *int x = 0. Starting point of the for loop. Variable x is set to 0.
		 *x < 5. The loop will continue as long as the variable x is less than 5.
		 *x++. Everytime the loop repeats, the variable x will add 1.
		 *	You don't always have to add 1. To add 2:
		 *		for (int x = 0; x < 5; x = x + 2)//This will add 2 each time the loop repeats.
		 */
		for (int x = 0; x < 5; x++)
		{
			//This will print how many times the loop is repeating back to the user. Only less than five times.
			System.out.println("This loop has repeated " + x + " times.");
		}
		for (int y = 20; y >=10; y = y - 2)
		{
			System.out.println("This should print 6 times");
		}
		
		/**
		 * While loop.
		 * Only repeats if a condition is met.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess what number I'm thinking.");
		numA = scan.nextInt();
		while (numA == 6)//If the user guesses 6, the following will run
		{
			System.out.println("You win!");
			break; //Prevents an infinite loop
		}
		if (numA != 6)
		{
			System.out.println("You lose!");
		}
	}
}
