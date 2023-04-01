package chapter04_ex;
import java.util.Scanner;

public class ex04_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String character = input.next();
		input.close();
		
		if(character.length() != 1) {
			System.out.println("Wrong input!");
			System.exit(1);
		}
		
		char ch = character.charAt(0);
		
		System.out.println("The Unicode for character " + ch + " is " + (int)ch);

	}

}
