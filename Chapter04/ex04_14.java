package chapter04_ex;
import java.util.Scanner;

public class ex04_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		String message = input.next();
		input.close();
		
		char grade = Character.toUpperCase(message.charAt(0));
		
		if(message.length() != 1 || grade > 'F') {
			System.out.println(message + " is an invalid grade!");
			System.exit(1);
		}
		
		int gradeNumber = 'A' - grade + 5;
		
		System.out.println("The numeric value for the grade " + grade + " is "+gradeNumber);

	}

}
