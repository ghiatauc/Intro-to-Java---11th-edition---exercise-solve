package chapter05_ex;
import java.util.Scanner;

public class ex05_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Loan Amount: ");
		double loanAmount = input.nextDouble();
		System.out.print("Number of Years: ");
		int numberOfYears = input.nextInt();
		input.close();
		
		//int numberOfYears = 5;  //test value
		//double loanAmount = 10000;  //test value
		
		double annualInterestRate = 5.000;
		
		System.out.printf("\n%-13s   %-15s   %-13s\n", "Interest Rate", "Monthly Payment", "Total Payment");
		
		for(int i = 0; i <= 4 * numberOfYears; i++) {
			
			double monthlyInterestRate = annualInterestRate / 1200.0;
			
			double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 -(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
			
			double totalPayment = monthlyPayment * numberOfYears * 12;
			
			System.out.printf("%6.3f%%    %15.2f   %15.2f\n",annualInterestRate, monthlyPayment,totalPayment);
			annualInterestRate += 0.250;
		}
		

	}

}
