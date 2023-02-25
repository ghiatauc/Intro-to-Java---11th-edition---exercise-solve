package chapter03_ex;
import java.util.Scanner;

public class ex03_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		input.close();
		
		int numberX = number;
		
		if(numberX < 0) {
			numberX = -numberX;
		}
		
		int digit1 = numberX / 100;
		int digit3 = numberX % 10;
		
		boolean isPalindrome = digit1 == digit3;
		
		System.out.println(number+(isPalindrome ? " is a palindrome" : " is not a palindrome"));

	}

}
/*
(Palindrome integer)
Write a program that prompts the user to enter a three-digit integer and determines whether it is a palindrome integer. 
An integer is palindrome if it reads the same from right to left and from left to right. 
A negative integer is treated the same as a positive integer.
*/