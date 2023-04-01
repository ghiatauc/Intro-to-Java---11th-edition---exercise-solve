package chapter05_ex;
import java.util.Scanner;

public class ex05_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int gcd = 1;
		
		System.out.print("Enter first number: ");
		int number1 = input.nextInt();
		System.out.print("Enter second number: ");
		int number2 = input.nextInt();
		input.close();
		
		//int number1 = 125;   //test value
		//int number2 = 2525;  //test value
		
		int d = Math.min(number1, number2);
		
		for(int i = d; i > 0; i--) {
			if(number1 % i == 0 && number2 % i == 0) {
				gcd = i;
				break;
			}
		}
		
		System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " +gcd);

	}

}
