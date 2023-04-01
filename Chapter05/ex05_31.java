package chapter05_ex;
import java.util.Scanner;

public class ex05_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the initial deposit amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter the annual percentage yield: ");
		double annualPercentageYield = input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int months = input.nextInt();
		input.close();
		
		/*
		//test value
		double amount = 10000;
		double annualPercentageYield = 6.15;
		int months = 18;
		*/
		
		System.out.printf("\n%5s   %8s", "Month", "CD Value\n");
		for(int i = 1; i <= months; i++) {
			amount = amount + (amount * annualPercentageYield / 1200.0);
			System.out.printf("%-5d   %8.2f\n",i, amount);
		}
		
	}

}
