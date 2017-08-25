/**
 Types of variables:
 boolean, byte, char, double, float, int, long, short
 Rules:
 Java variables cannot start with a number or special symbol
 Java variables cannot be a keyword(words that are used with java like
 if, try, catch)

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
				
		//Char - surrounded by single quotes. case sensitive
		System.out.println("Char holds a single character. A character is a single letter, number, or symbol.");
		char c = 'C';
		System.out.println("The character value is " + c + ".");
		
		//Double
		System.out.println("Double holds decimal values.");
		double number = 6.66;
		double numbers = 4;
		System.out.println("The value of number is " + number + ".");
		System.out.println("The value of numbers is " + numbers + ". It converts 4 into a decimal.");
		
		//Int 
		System.out.println("Opposite of decimals. Only hold integers. Non decimal numbers. ");
		int num = 6;
		System.out.println("The value of num is " + num + ".");
	
		//Other
		int num1 = 6, num2 = 4, num3;
		num3 = num1 + num2;
		System.out.println("The value of num3 is " + num3 + ".");
			//String has to be capitalized
		String uno = "hola ", dos = "ese";
		System.out.println(uno + dos);
	
		//Math - order of operations. parenthesis to force first order. Java reads left from right.
		int num5 = 4+6/2;
		System.out.println(num5);
		int num6 = (1+3) + (2*5), num7 = (1+3)/2;
		System.out.println(num6);
		System.out.println(num7);
	}

}
