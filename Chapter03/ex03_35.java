package chapter03_ex;
import java.util.Scanner;

public class ex03_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		input.close();
		
		if(number % 2 == 0) {
			System.out.println(number+" is even number!");
		}else {
			System.out.println(number+" is odd number!");
		}

	}

}
/*
(Even or odd number)
Write a program that prompts the user to enter an integer and displays whether the integer is an odd number or not.
*/