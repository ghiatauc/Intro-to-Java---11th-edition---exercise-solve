package chapter04_ex;
import java.util.Scanner;

public class ex04_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount in double, for example 11.56: ");
		String amount = input.next();
		input.close();

		//String amount = "11.56"; //test value
		
		int k = amount.indexOf('.');
		
		String dollarsString = amount.substring(0,k);
		String centsString = amount.substring(k+1);
		
		int dollars = Integer.parseInt(dollarsString);
		int cents = Integer.parseInt(centsString);
		
		int numbersOfQuarters = cents / 25;
		cents = cents % 25;
		
		int numbersOfDimes = cents / 10;
		cents = cents % 10;
		
		int numbersOfNickels = cents / 5;
		cents = cents % 5;
		
		
		System.out.println("Your amount " + amount + " consists of\n\t" + dollars + " dollars\n\t" + numbersOfQuarters + 
				" quarters\n\t" + numbersOfDimes + " dimes\n\t" + numbersOfNickels + " nickels\n\t" + cents + " pennies");
		

	}

}
