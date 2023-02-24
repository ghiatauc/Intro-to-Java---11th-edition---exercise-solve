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
