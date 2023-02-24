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
