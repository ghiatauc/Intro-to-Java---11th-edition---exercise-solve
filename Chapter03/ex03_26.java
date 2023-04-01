package chapter03_ex;
import java.util.Scanner;

public class ex03_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		input.close();
		
		
		System.out.println("Is "+number+" divisible by 4 and 5? "+(number % 4 == 0 && number % 5 == 0));
		
		System.out.println("Is "+number+" divisible by 4 or 5? "+(number % 4 == 0 || number % 5 == 0));
		
		System.out.println("Is "+number+" divisible by 4 or 5, nut not both? "+(number % 4 == 0 ^ number % 5 == 0));

	}

}

/*
(Use the &&, || and ^ operators) 
Write a program that prompts the user to enter an integer and determines whether it is divisible by 4 and 5, 
whether it is divisible by 4 or 5, and whether it is divisible by 4 or 5 but not both.
*/