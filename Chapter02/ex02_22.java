package chapter02_ex;
import java.util.Scanner;

public class ex02_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount in integer, for example 11.56 enter 1156: ");
		int amount = input.nextInt();
		
		int remainingAmount = amount;
		
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
		System.out.println("     "+numberOfOneDollars+" dollars");
		System.out.println("     "+numberOfQuarters+" quarters");
		System.out.println("     "+numberOfDimes+" dimes");
		System.out.println("     "+numberOfNickels+" nickels");
		System.out.println("     "+numberOfPennies+" pennies");

	}

}
