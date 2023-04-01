package chapter03_ex;
import java.util.Scanner;

public class ex03_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double dollarToRMB = input.nextDouble();
		
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int choice = input.nextInt();
		
		if(choice == 0) {
			System.out.print("Enter the dollar amount: ");
			double dollarAmount = input.nextDouble();
			double RMBAmount = dollarAmount * dollarToRMB;
			
			RMBAmount = ((int)(RMBAmount * 100)) / 100.0;
			
			System.out.println("$"+dollarAmount+" is "+RMBAmount+" yuan");
		}else if(choice == 1){
			System.out.print("Enter the RMB amount: ");
			double RMBAmount = input.nextDouble();
			double dollarAmount = RMBAmount * (1 / dollarToRMB);
			
			dollarAmount = (int)(dollarAmount * 100) / 100.0;
			
			System.out.println(RMBAmount+" yuan is $"+dollarAmount);
		}else {
			System.out.println("Incorrect input!");
			System.exit(1);
		}
		
		input.close();

	}

}
/*
(Financial: currency exchange)
Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB.
Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB to U.S. dollars.
Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively
*/