package chapter06_ex;
import java.util.Scanner;

public class ex06_31_myVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long card = 4388576018410707L; //test value - returns valid
		//long card = 4388576018402626L; //test value - returns invalid
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card as a long integer: ");
		long card = input.nextLong();
		input.close();
		
		System.out.println(card + " is " + (isValid(card) ? "valid" : "invalid"));
		
	}
	
	public static boolean isValid(long number) {
		
		String card = number + "";
		
		if(card.length() < 13 || card.length() > 16) {
			return false;
		}
		
		if(!(prefixMatched(number, 37) || prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 6))) {
			return false;
		}

		
		if((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 != 0) {
			return false;
		}
		
		
		return true;
	}
	
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String card = number + "";
		int size = card.length();
		
		for(int i = size - 2; i >= 0; i = i - 2) {
			int digit = 2 * Integer.parseInt(card.charAt(i) + "");
			sum += getDigit(digit);
		}
		
		return sum;
	}

	public static int getDigit(int number) {
		int digit = 0;
		
		if(number < 10) {
			digit = number;
		}else {
			digit = digit + (number % 10);
			digit = digit + (number / 10);
		}
		
		return digit;
	}
	
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String card = number + "";
		int size = card.length();
		
		for(int i = size - 1; i > 0; i = i - 2) {
			sum = sum + Integer.parseInt(card.charAt(i) + "");
		}
		
		return sum;
	}

	public static boolean prefixMatched(long number, int d) {
		String card = number + "";
		String prefix = d + "";
		
		return card.startsWith(prefix);
	}
	
}
