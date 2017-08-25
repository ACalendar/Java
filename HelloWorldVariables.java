//Author: ACalendar

/**
 * This class will cover some variables using a few of the data types below:
 boolean, byte, char, double, float, int, long, short
 Rules:
 Java variables cannot start with a number or special symbol
 Java variables cannot be a keyword(words that are used with java like "if", "try", "catch", etc).
 */

public class HelloWorldVariables 
{
	public static void main(String[] args) 
	{			
		// Boolean
		System.out.println("Boolean is either true or false.");
		boolean x = true;
		System.out.println("The value of boolean x is " + x + ".");
		boolean y;
		System.out.println("Boolean y has no value.");
				
		//Char - surrounded by single quotes. Case sensitive
		System.out.println("Char holds a single character. A character is a single letter, number, or symbol.");
		char c = 'C';
		System.out.println("This character value is " + c + ".");
		
		//Double
		System.out.println("Double holds decimal values.");
		double number = 6.66;
		double numbers = 4;
		System.out.println("The value of number is " + number + ".");
		System.out.println("The value of numbers is " + numbers + ". It converts 4 into the decimal 4.0.");
		
		//Int 
		System.out.println("Opposite of decimals. The data type int holds non decimal numbers.");
		int num = 6;
		System.out.println("The value of num is " + num + ".");
	
		//We can use variables to do math.
		int num1 = 6, num2 = 4, num3;//Since all three variables are using the int data type, we can declare them and assign values on the same line.
		num3 = num1 + num2;
		System.out.println("The value of num3 is " + num3 + ".");
		
		//Adding strings together
		String one = "Hi ", two = "friend!";
		System.out.println(one + two);
	
		//Math - Remember the order of operations. Also, Java reads left from right.
		int num5 = 4+6/2;//Answer is 7. 6/2=3. 3+4=7.
		System.out.println(num5);
		
		int num6 = (1+3) + (2*5), num7 = (1+3)/2;//num6 and num7 are both integer data types. So the declaring and assigning of an equation can be done on the same line.
		System.out.println(num6);
		System.out.println(num7);
	}
}
