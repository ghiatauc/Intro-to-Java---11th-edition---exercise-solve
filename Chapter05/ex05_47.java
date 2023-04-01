package chapter05_ex;
import java.util.Scanner;

public class ex05_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
		String isbn13 = input.next();
		input.close();
		
		//String isbn13 = "978013213080"; //test value - 6
		//String isbn13 = "978013213079"; //test value - 0
		//String isbn13 = "97801320";
		
		if(isbn13.length() != 12) {
			System.out.print(isbn13 + " is an invalid input");
			System.exit(0);
		}
		
		int isbnSum = 0;
		
		for(int i = 0; i < isbn13.length(); i++) {
			int digit = (int)isbn13.charAt(i) - '0';
			
			if(i % 2 != 0) {
				digit = 3 * digit;
			}
			
			isbnSum += digit;
		}
		
		int lastDigit = 10 - isbnSum % 10;
		
		if(lastDigit == 10) {
			System.out.println("The ISBN-13 number is " + isbn13 + 0);
		}else {
			System.out.println("The ISBN-13 number is " + isbn13 + lastDigit);
		}
		

	}

}
