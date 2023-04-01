package chapter04_ex;
import java.util.Scanner;

public class ex04_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter: ");
		String message = input.next();
		input.close();
		
		char ch = message.charAt(0);
		
		if(!Character.isLetter(ch)) {
			System.out.println(ch + " is an invalid input!");
			System.exit(1);
		}
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch + " is a vowel");
		}else {
			System.out.println(ch + " is a consonant");
		}
		
		
		//System.out.println(ch);

	}

}
