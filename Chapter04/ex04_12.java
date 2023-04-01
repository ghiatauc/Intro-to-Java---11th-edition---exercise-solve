package chapter04_ex;
import java.util.Scanner;

public class ex04_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		String hexString = input.nextLine();
		input.close();

		if(hexString.length() != 1) {
			System.out.println("You must enter exactly one character!");
			System.exit(1);
		}
		
		char ch = Character.toUpperCase(hexString.charAt(0)); //convert to upper case letter
		
		int value = 0;
		
		if(ch >= 'A' && ch <= 'F') {
			value = ch - 'A' + 10;
		}else if(Character.isDigit(ch)) {
			value = Integer.parseInt(""+ch);
		}else {
			System.out.println(ch + " is an invalid input");
			System.exit(1);
		}
		
		String binary = "";
		
		int remainder = value % 2;
		binary = remainder + binary;
		value /= 2;
		
		remainder = value % 2;
		binary = remainder + binary;
		value /= 2;
		
		remainder = value % 2;
		binary = remainder + binary;
		value /= 2;
		
		remainder = value % 2;
		binary = remainder + binary;
		
		System.out.println("The binary value is "+binary);
		
 	}

}
