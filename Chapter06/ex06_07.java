package chapter06_ex;

import java.util.Scanner;

public class ex06_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("The amount invested: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();
		input.close();
		
		double monthlyInterestRate = annualInterestRate / 1200.0;
		
		System.out.println("Years       Future Value");
		for(int i = 1; i <= 30; i++) {
			System.out.printf("%-2d              %8.2f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
		}

	}
	
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * (Math.pow(1 + monthlyInterestRate, years * 12));
	}

}
