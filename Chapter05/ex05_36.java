package chapter05_ex;
import java.util.Scanner;

public class ex05_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 9 digits of an ISBN: ");
		String isbn = input.next();
		input.close();
		
		//String isbn = "013601267"; //test value 1
		//String isbn = "013031997"; //test value X
		
		if(isbn.length() != 9) {
			System.out.print("Wrong input!");
			System.exit(0);
		}
		
		int sum = 0;
		
		for(int i = 0; i < isbn.length(); i++) {
			char digitChar = isbn.charAt(i);
			int digit = (int)digitChar - '0';
			sum += (i + 1) * digit;
		}
		
		int lastDigit = sum % 11;
		
		if(lastDigit == 10) {
			System.out.println("The ISBN-10 number is " + isbn + "X");
		}else {
			System.out.println("The ISBN-10 number is " + isbn + lastDigit);
		}

	}

}
