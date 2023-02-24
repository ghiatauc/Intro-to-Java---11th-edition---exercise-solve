package chapter02_ex;
import java.util.Scanner;

public class ex02_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		
		System.out.print("Enter annual interest rate in percentage: ");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years: ");
		double numberOfYears = input.nextDouble();
		
		input.close();
		
		double futureInvestmentValue = investmentAmount * (Math.pow(1 + (annualInterestRate / 1200.0), numberOfYears * 12));
		
		System.out.println("Future value is £"+(int)(futureInvestmentValue * 100) / 100.0);
	}

}
/*
(Financial application: calculate future investment value) 
Write a program that reads in investment amount, annual interest rate, 
and number of years and displays the future investment value using the 
following formula:
futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 For example, if you enter amount 1000, annual interest rate 3.25%, and number 
of years 1, the future investment value is 1032.98.
*/