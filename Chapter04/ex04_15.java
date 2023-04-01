package chapter04_ex;
import java.util.Scanner;

public class ex04_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String key = input.next();
		input.close();
		
		if(key.length() != 1 || !Character.isLetter(key.charAt(0))) {
			System.out.println(key + " is an invalid input");
			System.exit(1);
		}
		
		char ch = Character.toLowerCase(key.charAt(0));
		//first version
		if(ch == 'a' || ch == 'b' || ch == 'c') {
			System.out.println("The corresponding number is 2");
		} else if(ch == 'd' || ch == 'e' || ch == 'f') {
			System.out.println("The corresponding number is 3");
		} else if(ch == 'g' || ch == 'h' || ch == 'i') {
			System.out.println("The corresponding number is 4");
		} else if(ch == 'j' || ch == 'k' || ch == 'l') {
			System.out.println("The corresponding number is 5");
		} else if(ch == 'm' || ch == 'n' || ch == 'o') {
			System.out.println("The corresponding number is 6");
		} else if(ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
			System.out.println("The corresponding number is 7");
		} else if(ch == 't' || ch == 'u' || ch == 'v') {
			System.out.println("The corresponding number is 8");
		} else if(ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
			System.out.println("The corresponding number is 9");
		} 
		
		//second version
		/*
		if(ch >= 'a' && ch <= 'c') {
			System.out.println("The corresponding number is 2");
		} else if(ch >= 'd' && ch <= 'f') {
			System.out.println("The corresponding number is 3");
		} else if(ch >= 'g' && ch <= 'i') {
			System.out.println("The corresponding number is 4");
		} else if(ch >= 'j' && ch <= 'l') {
			System.out.println("The corresponding number is 5");
		} else if(ch >= 'm' && ch <= 'o') {
			System.out.println("The corresponding number is 6");
		} else if(ch >= 'p' && ch <= 's') {
			System.out.println("The corresponding number is 7");
		} else if(ch >= 't' && ch <= 'v') {
			System.out.println("The corresponding number is 8");
		} else if(ch >= 'w' && ch <= 'z') {
			System.out.println("The corresponding number is 9");
		} 
		*/

	}

}
