package chapter03_ex;
import java.util.Scanner;

public class ex03_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		input.close();
		
		int remainingAmount = (int)(amount * 100);
		
		//number of dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		//number of quarters
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;
		
		//number of dimes
		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;
		
		//number of nickels
		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;
		
		//number of pennies
		int numberOfPennies = remainingAmount;
		
		System.out.println("Your amount "+amount+" consists of ");
		System.out.println("     "+numberOfOneDollars+(numberOfOneDollars == 1 ? " dollar" : " dollars"));
		System.out.println("     "+numberOfQuarters+(numberOfQuarters == 1 ? " quarter" : " quarters"));
		System.out.println("     "+numberOfDimes+(numberOfDimes == 1 ? " dime" : " dimes"));
		System.out.println("     "+numberOfNickels+(numberOfNickels == 1 ? " nickel" :" nickels"));
		System.out.println("     "+numberOfPennies+(numberOfPennies == 1 ? " penny" : " pennies"));

	}

}
/*
(Financial application: monetary units)
Modify Listing 2.10, ComputeChange.java, to display the nonzero denominations only, using singular words for 
single units such as 1 dollar and 1 penny, and plural words for more than one unit such as 2 dollars and 3 pennies.
*/ 