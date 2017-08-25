//Author: ACalendar

/**
**The following HellowWorld class displays text(also known as a string data type) to the user. 
There is no "one way to code", so I've showed three exmaples of creating the same string.
*/
public class HelloWorld 
{
	public static void main(String[] args) 
	{		
		/**
		*Example 1:
		**/
		System.out.println("Hello World!"); //Hello World! Is displayed to user.
		
		/**
		Example 2: 
		**/
		System.out.println("Hello " + "World!"); //This example combines two strings together by using "+". 
		
		//Example 3:   
		System.out.println("Hello ");//This example still displays, "Hello World" to the user.
		System.out.println("World!");//However, it's printed on two different lines, instead of just one.
	}
}
