package chapter05_ex;
import java.util.Scanner;

public class ex05_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		double annualInterestRate = input.nextDouble();
		input.close();
		
		//test values
		//double loanAmount = 10000;
		//int numberOfYears = 1;
		//double annualInterestRate = 7;
		
		double monthlyInterestRate = annualInterestRate / 1200.0;
		double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 -(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.printf("\nMonthly Payment: %.2f\nTotal Payment: %.2f", monthlyPayment,totalPayment);
		
		System.out.printf("\n\n%8s   %8s   %9s   %7s","Payment#","Interest","Principal","Balance");
		
		for(int i = 1; i <= numberOfYears * 12; i++) {
			double interest = monthlyInterestRate * loanAmount;
			double principal = monthlyPayment - interest;
			loanAmount = loanAmount - principal;
			
			System.out.printf("\n%-8d   %-8.2f   %-9.2f   %-7.2f",i,interest,principal,loanAmount);
			
		}
		
	}

}
