package chapter04_ex;
import java.util.Scanner;

public class ex04_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of an ISBN: ");
		String isbn = input.next();
		input.close();
		
		//test values
		//String isbn = "013601267"; //test value for digit
		//String isbn = "013031997"; //test value for X
		
		//d1 is first digit ... d9 is last digit
		int d1 = Integer.parseInt(isbn.charAt(0) + "");
		int d2 = Integer.parseInt(isbn.charAt(1) + "");
		int d3 = Integer.parseInt(isbn.charAt(2) + "");
		int d4 = Integer.parseInt(isbn.charAt(3) + "");
		int d5 = Integer.parseInt(isbn.charAt(4) + "");
		int d6 = Integer.parseInt(isbn.charAt(5) + "");
		int d7 = Integer.parseInt(isbn.charAt(6) + "");
		int d8 = Integer.parseInt(isbn.charAt(7) + "");
		int d9 = Integer.parseInt(isbn.charAt(8) + "");
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		System.out.println("The ISBN-10 number is " + (d10 == 10 ? isbn + "X" : isbn + d10));

	}

}
