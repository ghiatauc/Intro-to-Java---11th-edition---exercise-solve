package chapter06_ex;
import java.util.Scanner;

public class ex06_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number and its width: ");
		int number = input.nextInt();
		int width = input.nextInt();
		input.close();
		
		System.out.println("Formated number is " + format(number, width));

	}
	
	public static String format(int number, int width) {
		String str = "";
		String numberString = number + "";
		
		if(width <= numberString.length()) {
			return numberString;
		}
		
		for(int i = 0; i < width - numberString.length(); i++) {
			str = str + '0';
		}
		
		str = str + numberString;
		
		return str;
	}

}
