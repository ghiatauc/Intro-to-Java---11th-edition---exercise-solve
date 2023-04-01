package chapter04_ex;
import java.util.Scanner;

public class ex04_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter binary digits (0000 to 1111): ");
		String number = input.nextLine();
		input.close();
		
		if(number.length() != 4) {
			System.out.println("Error! Out of boundary");
			System.exit(1);
		}
		
		if((number.charAt(0) != '0' && number.charAt(0) != '1') || (number.charAt(1) != '0' && number.charAt(1) != '1') ||
				(number.charAt(2) != '0' && number.charAt(2) != '1') || (number.charAt(3) != '0' && number.charAt(3) != '1')) {
			System.out.println("Error! Enter only 0 and 1");
			System.exit(1);
		}
		
		
		int n3 = Integer.parseInt(""+number.charAt(0));
		int n2 = Integer.parseInt(""+number.charAt(1));;
		int n1 = Integer.parseInt(""+number.charAt(2));;
		int n0 = Integer.parseInt(""+number.charAt(3));;
		
		int decimal = (int) (n3 * Math.pow(2, 3) + n2 * Math.pow(2, 2) + n1 * Math.pow(2, 1) + n0 * Math.pow(2, 0));
		
		System.out.println("The decimal value is "+decimal);

	}

}
