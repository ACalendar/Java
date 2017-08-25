//Needed to use scanner in programmer. Import things that already exist in java
import java.util.Scanner;

/**
 * Scanner allows programmer to get info from user.
  *
 */
public class HelloWorldInput 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Hola User!");
		//Variable = scan.
		Scanner scan = new Scanner(System.in);
		//This line needs to be right under Scanner variable
		scan.nextLine();//Takes what user inputs and stores it into variable scan
		System.out.println("Como te llama?");
		String input = scan.nextLine();//It's a string. We declared variable named input. The scanner will take whatever is entered on the next line. NextLine(); reads one line at a time, including white spaces. Only stops when user hits enter.
		System.out.println("Welcome " + input + "!");//Will print info the user entered in variable input
		System.out.println("Where are you from?");
		String born = scan.next();//string. variable is born. Next(); goes to next blank white space. Good if only need one word.
		System.out.println("Oh! Cool, I love " + born + "!");
		System.out.println("How old are you?");
		int age = scan.nextInt();//If user enters a non number, the program will crash.
		System.out.println("Ah! I remember when I was " + age + ".");
		
	}

}
