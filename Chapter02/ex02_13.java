package chapter02_ex;
import java.util.Scanner;

public class ex02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double anualInterestRate = 0.0375;
		final double monthlyInterestRate = anualInterestRate / 12;
		
		System.out.print("Enter the monthly saving amount: ");
		double amount = input.nextDouble();
		input.close();
		
		double savings = 0;
		
		//first month
		savings = (amount + savings) * (1 + monthlyInterestRate);
		
		//second month
		savings = (amount + savings) * (1 + monthlyInterestRate);
		
		//third month
		savings = (amount + savings) * (1 + monthlyInterestRate);
		
		//forth month
		savings = (amount + savings) * (1 + monthlyInterestRate);
		
		//fifth month
		savings = (amount + savings) * (1 + monthlyInterestRate);
		
		//sixth month
		savings = (amount + savings) * (1 + monthlyInterestRate);
		
		System.out.println(savings);
	}

}
/*
(Financial application: compound value) 
Suppose you save $100 each month in a 
savings account with annual interest rate 3.75%. Thus, the monthly interest rate is 
0.0375/12 = 0.003125. After the first month, the value in the account becomes
			100 * (1 + 0.003125) = 100.3125
 After the second month, the value in the account becomes
 			(100 + 100.3125) * (1 + 0.003125) = 200.938
 After the third month, the value in the account becomes
 			(100 + 200.938) * (1 + 0.003125) = 301.878
 and so on.
Write a program that prompts the user to enter a monthly saving amount and 
displays the account value after the sixth month.
*/
