package chapter04_ex;
import java.util.Scanner;

public class ex04_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String message = input.next();
		input.close();
		
		//String message = "letter"; //test string
		System.out.println("String entered: " +message);
		System.out.println("Length of string: " + message.length());
		System.out.println("Last character of string: " + message.charAt(message.length() - 1));
		

	}

}
