/*
Benjamin Luck 
CoSci 290 


	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	Sample output with odd number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...
	Sample output with even number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...
	
	Note:
	Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/
// added the import that was missing 
import java.util.Scanner;

public class Lab12{

	public static void main(String[] args){
		//corrected the capitalization 
		Scanner input = new Scanner(System.in);
		
		// added proper quotation 
		System.out.println("This program will check if a number"
			+ " is even or odd...");

		System.out.println("Please enter in a whole number...");
		// added Int and deleted the prior int num 
		int num = input.nextInt();
		
		checkNums(num); // added s to make it even with the public static void 
	}
	
	public static void checkNums(double num){
		// completed the "oops"
		if ( num % 2 == 0 )
         System.out.println("You entered an even number!");
    else
         System.out.println("You entered an odd number!");


		//oops...  still need to implement

	}
	}
	
// deleted the last backslash since it was extra 