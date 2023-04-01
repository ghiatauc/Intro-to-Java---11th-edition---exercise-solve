package chapter05_ex;
import java.util.Scanner;

public class ex05_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int decimalNumber = input.nextInt();
		input.close();
		
		//int decimalNumber = 7562; //test value 16612 octal
		
		int decimal = decimalNumber;
		String octalNumber = "";
		
		while(decimalNumber != 0) {
			int octalDigit = decimalNumber % 8;
			octalNumber = octalDigit + octalNumber;
			decimalNumber /= 8;
		}
		
		System.out.println("Octal conversion: " +decimal + "(decimal) is " +octalNumber + "(octal)");

	}

}
