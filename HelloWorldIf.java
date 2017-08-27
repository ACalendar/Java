import java.util.Scanner;

//Author: ACalendar

/**
 * The purpose of this class is to show how different if statements can be used in Java.
  */

public class HelloWorldIf 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		 int num10 = 1, num11 = 11, num12 = 12, num13, num14, num15, num16;//Declared an int variables. 
		 String nameA, nameB, nameC, nameD;//Declared 4 string variables.
	
		/**
		 * This is one of the more simple if statements to use. If one condition is met, the code inside the if brackets will run. 
		 */
		System.out.println("Knock Knock.");
		System.out.println("Who's there?");
		System.out.println("Interrupting cow.");
		System.out.println("Enter 1 to continue this joke.");
		
		num13 = scan.nextInt();
		if (num13 == 1)//If the variable num13 equals 1(the user chose to continue the joke), then the code inside the brackets runs. 
				{			
				System.out.println("Interrupting cow who-MOOOOO! This corny joke was brought to you by A Calendar :)");
				}
	
	
		/**
		 * This next example is a bit more complicated. It uses an if/else statement. 
		 * If/else statements are used when the developer needs to code for more than one condition.
		 */
		System.out.println("Would you like to hear another corny joke? Enter 1 for yes, 2 for no.");
		num10 = scan.nextInt();
		if (num10 == 1)
		{
			System.out.println("Why do chicken coups always have 2 doors?");
			System.out.println("With 4 doors, they'd be chicken sedans!");
		}
		else if (num10 == 2)
		{
			System.out.println("Ok, back to coding we go!");
		}
		else if (num10 !=1 || num10 !=2)//The != means it does not equal. || means or. && would be and. 
		{
			System.out.println("You didn't enter 1 or 2. But it's okay, we can still go back to the coding");
		}
	
		
		/**
		 * A developer might want to have multiple conditions. If that's the case, the following exxample can be used.
		 */
		System.out.println("Please select one of the following: "
				+ " 1. Joke about food."
				+ " 2. Joke about animals."
				+ " 3. Joke about snow."
				+ " 4. Joke about the water.");
		num11 = scan.nextInt();
		if (num11 == 1)
		{
			System.out.println("What do you call fake spaghetti?"
					+ " An im-pasta!");
		}
		else if (num11 == 2)
		{
			System.out.println("What do you call birds that stick together?"
					+ " Vel-crows!");
		}
		else if (num11 == 3)
		{
			System.out.println("What did one snowman say to the other snowman?"
					+ " Smells like carrots!");
		}
		else if (num11 == 4)
		{
			System.out.println("What did the ocean say to the shore?"
					+ " Nothing. It just waved!");
		}
		else//This ends with an else. If none of the if or if/else conditions from above are met, this will run. 
			//This comes in handy when doing math equations or games. It's a way to jump to the end of the game. 
		{
			System.out.println("You didn't select a corny joke :(");
		}
		
		/**
		 * This is called a nested if else statement. If one condition is met, the code can go to another if/else statement.
		 * These can sometimes get tricky if a developer uses multiple nested if/else statements. 
		 */
		System.out.println("Lets take a break from jokes. Select an animal."
				+ " 1. Dog"
				+ " 2. Cat");
		
		num12 = scan.nextInt();
		if (num12 == 1)//User picked Dog
				{
				System.out.println("Is the dog a male or female?"
						+ " 1. Male"
						+ " 2. Female");
				num11 = scan.nextInt();
				if (num11 == 1)//Options for male dog. Notes are very helpful when using nested if statements. It helps keep the developer organized.
				 {
					System.out.println("What's his name?"); 
					nameA = scan.next();
					System.out.println("Hey there " + nameA + "! He's adorable!");
				 }
				 else if (num11 == 2)
				 {
					System.out.println("What's her name?"); 
					nameB = scan.next();
					System.out.println("Hey there " + nameB + "! She's adorable!");
				 }
				 else
				 {
					 System.out.println("You did not select male or female.");
				 }
				}
		else if (num12 == 2)//The user picked cat.
		{
			System.out.println("Is the cat a male or female?"
					+ " 1. Male"
					+ " 2. Female");
			num11 = scan.nextInt();
			if (num11 == 1)//Options for male cat. N
			 {
				System.out.println("What's his name?"); 
				nameC = scan.next();
				System.out.println("Hey there " + nameC + "! He's adorable!");
			 }
			 else if (num11 == 2)
			 {
				System.out.println("What's her name?"); 
				nameD = scan.next();
				System.out.println("Hey there " + nameD + "! She's adorable!");
			 }
			 else
			 {
				 System.out.println("You did not select male or female.");
			 }
			}
		else
		{
			System.out.println("You did not select an animal.");
		}
	}
}
