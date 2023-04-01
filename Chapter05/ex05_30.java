package chapter05_ex;
import java.util.Scanner;

public class ex05_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter the annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		System.out.print("Enter the number of months: ");
		int months = input.nextInt();
		input.close();
		
		/*
		//test value
		double amount = 100;
		double annualInterestRate = 3.75;
		int months = 6;
		*/
		
		double monthlyInterestRate = annualInterestRate / 1200.0;
		double savings = 0;
		
		for(int i = 0; i < months; i++) {
			savings = (savings + amount) * (1 + monthlyInterestRate);
		}
		
		System.out.printf("Your total savings after " + months + " months is £%.3f",savings);
		

	}

}
