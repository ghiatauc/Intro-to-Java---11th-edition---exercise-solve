package chapter06_ex;
import java.util.Scanner;

public class ex06_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//long card = 4388576018410707L;
		//long card = 4388576018402626L;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card as a long integer: ");
		long card = input.nextLong();
		input.close();
		
		//sumOfOddPlace(card);
		//sumOfDoubleEvenPlace(card);
		//System.out.println(getDigit(12));
		//getSize(card);
		//System.out.println(prefixMatched(card, 4));;
		
	}
	
	public static boolean isValid(long number) {
		
		String card = number + "";
		
		if(card.length() < 13 || card.length() >= 16) {
			
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
		
		System.out.println(sum);
		return 1;
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
			//sum = sum + Integer.parseInt(card.charAt(i) + "");
			System.out.println(card.charAt(i));
		}
		//System.out.println(sum);
		return 1;
	}
	
	public static boolean prefixMatched(long number, int d) {
		String card = number + "";
		String prefix = d + "";
		
		return card.startsWith(prefix);
	}
	
	public static int getSize(long number) {
		String card = number + "";
		System.out.println(card.length());
		return 1;
	}
	
	public static long getPrefix(long number, int k) {
		
		return 1L;
	}

}
