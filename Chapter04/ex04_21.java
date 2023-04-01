package chapter04_ex;
import java.util.Scanner;

public class ex04_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a SSN: ");
		String ssn = input.next();
		input.close();
		
		//test ssn
		//String ssn = "232-23-5435";
		//String ssn = "23-23-54355";
		//String ssn = "122-23-5D35";
		
		if(ssn.length() != 11) {
			System.out.println(ssn + " is an invalid social security number");
			System.exit(1);
		}
		
		if(ssn.charAt(3) != '-' && ssn.charAt(6) != '-') {
			System.out.println(ssn + " is an invalid social security number 2");
			System.exit(1);
		}
		
		if(!Character.isDigit(ssn.charAt(0)) || !Character.isDigit(ssn.charAt(1)) || !Character.isDigit(ssn.charAt(2))
				|| !Character.isDigit(ssn.charAt(4)) || !Character.isDigit(ssn.charAt(5))
				|| !Character.isDigit(ssn.charAt(7)) || !Character.isDigit(ssn.charAt(8)) ||!Character.isDigit(ssn.charAt(9))) {
			System.out.println(ssn + " is an invalid social security number 3");
			System.exit(1);
		}
		
		System.out.println(ssn + " is a valid social security number");

	}

}
