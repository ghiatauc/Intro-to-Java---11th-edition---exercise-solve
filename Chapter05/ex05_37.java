package chapter05_ex;
import java.util.Scanner;

public class ex05_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int decimalNumber = input.nextInt();
		input.close();
		
		
		//int decimalNumber = 13; //test value 1101 binary
		int decimal = decimalNumber;
		String binaryNumber = "";
		
		while(decimalNumber != 0) {
			int binaryDigit = decimalNumber % 2;
			binaryNumber = binaryDigit + binaryNumber;
			decimalNumber /= 2;
		}
		
		System.out.println("Binary conversion: " +decimal + "(decimal) is " +binaryNumber + "(binary)");

	}

}
