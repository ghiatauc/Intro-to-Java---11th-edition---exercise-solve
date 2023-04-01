package chapter06_ex;
import java.util.Scanner;

public class ex06_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		input.close();
		
		//test values return 12.3, 8.7, 1.5
		/*
		double num1 = 1.5;
		double num2 = 12.3;
		double num3 = 8.7;
		*/
		System.out.print("Decresing order: ");
		displaySortedNumbers(num1, num2, num3);

	}
	
	public static void displaySortedNumbers(double n1, double n2, double n3){
		if(n1 < n2) {
			double temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		if(n2 < n3) {
			double temp = n2;
			n2 = n3;
			n3 = temp;
		}
		
		if(n1 < n2) {
			double temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		System.out.println(n1 + " " + n2 + " " + n3);
			
	}

}
