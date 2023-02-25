package chapter03_ex;
import java.util.Scanner;

public class ex03_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		input.close();
		
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		
		switch(month) {
		case 1: System.out.print("January "+year+" has 31 days"); break;
		case 2: System.out.print("February "+year+(isLeap ? " has 29 days" : " has 28 days")); break;
		case 3: System.out.print("March "+year+" has 31 days"); break;
		case 4: System.out.print("April "+year+" has 30 days"); break;
		case 5: System.out.print("May "+year+" has 31 days"); break;
		case 6: System.out.print("June "+year+" has 30 days"); break;
		case 7: System.out.print("July "+year+" has 31 days"); break;
		case 8: System.out.print("August "+year+" has 31 days"); break;
		case 9: System.out.print("September "+year+" has 30 days"); break;
		case 10: System.out.print("October "+year+" has 31 days"); break;
		case 11: System.out.print("November "+year+" has 30 days"); break;
		case 12: System.out.print("December "+year+" has 31 days"); break;
		}
		
	}

}
/*
Find the number of days in a month)
Write a program that prompts the user to enter the month and year and displays the number of days in the month. 
For example, if the user entered month 2 and year 2012, the program should display that February 2012 has 29 days. 
If the user entered month 3 and year 2015, the program should display that March 2015 has 31 days.
*/