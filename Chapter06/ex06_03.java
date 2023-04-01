package chapter06_ex;
import java.util.Scanner;

public class ex06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		input.close();
		
		//int number = 456;  //test value return 654 and not palindrome
		//int number = 13531; // return 13531 and is palindrome
		
		//System.out.println(number + " reversed is " + reverse(number));
		System.out.println("Is " + number + " a palindrome number? " + isPalindrome(number));

	}
	
	public static int reverse(int number) {
		int reverse = 0;
		String n = number + "";
		int pow = n.length() - 1;
		
		for(int i = 0; i < n.length(); i++) {
			int value = number % 10;
			reverse += value * Math.pow(10, pow);
			number /= 10;
			pow--;
		}
		
		return reverse;
	}
	
	public static boolean isPalindrome(int number) {
		int reverse = reverse(number);
		
		if(number != reverse)
			return false;
		
		return true;
	}

}
