package chapter04_ex;
import java.util.Scanner;

public class ex04_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTax = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTax = input.nextDouble();
		input.close();
		
		double grossPay = hoursWorked * hourlyPayRate;
		double federalWithholding = grossPay * federalTax;
		double stateWithholding = grossPay * stateTax;
		double totalDeduction = federalWithholding + stateWithholding;
		double netPay = grossPay - totalDeduction;
		//format for 2 decimal ???
		System.out.print("\nEmployee Name: " + name + "\nHours Worked: " + hoursWorked + "\nPay Rate: $" + hourlyPayRate
				+ "\nGross Pay: $" + grossPay + "\nDeductions:\n\tFederal Withholding (20.0%): $" + federalWithholding
				+ "\n\tState Withholding (9.0%): $" + stateWithholding + "\n\tTotal Deduction: $" + totalDeduction 
				+ "\nNet Pay: $" + netPay);
		
	}

}
