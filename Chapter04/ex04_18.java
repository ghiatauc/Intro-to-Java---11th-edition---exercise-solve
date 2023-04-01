package chapter04_ex;
import java.util.Scanner;

public class ex04_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two characters: ");
		String message = input.next();
		input.close();
		
		//String message = ""; //test string
		
		//check if input = 2 , first char is letter and second char is digit
		if(message.length() != 2 || !Character.isLetter(message.charAt(0)) || !Character.isDigit(message.charAt(1))) {
			System.out.println("Invalid input!");
			System.exit(1);
		}
		
		String major = "";
		String status = "";
		//assign major grade
		switch(Character.toUpperCase(message.charAt(0))) {
		case 'I' : major = "Information Management"; break;
		case 'C' : major = "Computer Science"; break;
		case 'A' : major = "Accounting"; break;
		default : System.out.println("Invalid input!"); System.exit(1); 
		}
		//assign status grade
		switch(message.charAt(1)) {
		case '1' : status = "Freshman"; break;
		case '2' : status = "Freshman"; break;
		case '3' : status = "Freshman"; break;
		case '4' : status = "Freshman"; break;
		default : System.out.println("Invalid input!"); System.exit(1); 
		}
		//display result
		System.out.println(major + " " + status);
		

	}

}
