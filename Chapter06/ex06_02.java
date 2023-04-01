package chapter06_ex;
import java.util.Scanner;

public class ex06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		long number = input.nextLong();
		input.close();
		
		//long number = 234; //test value return 9
		System.out.println("Sum of digits for " + number + " is " + sumDigits(number));

	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		
		while(n != 0) {
			int value = (int)n % 10;
			sum += value;
			n /= 10;
		}
		
		return sum;
	}

}
