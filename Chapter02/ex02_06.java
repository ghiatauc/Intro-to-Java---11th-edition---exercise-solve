package chapter02_ex;
import java.util.Scanner;

public class ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		input.close();
		
		int numberUse = number;
		
		int n1 = numberUse % 10;
		numberUse /= 10;
		
		int n2 = numberUse % 10;
		numberUse /= 10;
		
		int n3 = numberUse;
		
		int multiplicator = n1 * n2 * n3;
				
		System.out.println("The multiplication of all digits in "+number+" is "+multiplicator);
	}

}
/*
(Multiply the digits in an integer) 
Write a program that reads an integer between 0 and 1000 and multiplies all the digits 
in the integer. For example, if an integer is 932, the multiplication of all its digits is 54.
*/