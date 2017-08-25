//Author: ACalendar

/**
**The following HelloWorldInput class works with getting input from the user and displaying back for the user to see.
*The class will use the string and integer data types only.
*/

import java.util.Scanner;//Needed to use Scanner - which will allow the program to get data from the user.

public class HelloWorldInput 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); //Will create a scan variable which allows us to get input from user.
		
		System.out.println("Hello! What is your name?");//"Hello! What is your name?" is displayed to the user.
				
		
		/**
		 * The data type that I want the user will enter is a string. I named the string variable, "name". 
		 * The variable could be any name(as long as it's not a java keyword).
		 * The scan variable that was created earlier is used here to get input from the user. 
		 * nextLine() will take everything the user types(hopefully their name) until the user hits enter.
		 */
		String name = scan.nextLine();
		
		
		System.out.println("Welcome " + name + "!");//Will print the name the user entered.
		System.out.println("Where are you from?");//New line will ask the user where's they're from.
		
		/**
		 * A second string variable, "born", was created. 
		 * next() can also be used. It will read what the user enters until the next white space.  
		 */
		String born = scan.next();
		
		System.out.println("Oh! Cool, I love " + born + "!");//Repeats the city/state that the user entered.
		System.out.println("How old are you?");//Ask the user how old they are.
		
		/**
		 * This time the integer data type is being used to store the users age.
		 */
		int age = scan.nextInt();//If the user doesn't not enter an integer, the program will crash.
		System.out.println("Ah! I remember when I was " + age + ". Well have a great day! Goodbye.");
	}
}
