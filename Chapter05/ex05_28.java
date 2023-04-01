package chapter05_ex;
import java.util.Scanner;

public class ex05_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the first day of year, as integer(Sunday-0, Monday-1...): ");
		int firstDay = input.nextInt();
		input.close();
		
		//int year = 2013;  //test value
		//int firstDay = 2;  //test value
		
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		//start the loop from 2 - easy way to see months
		for(int i = 1; i <= 12; i++) {

			switch(i) {
			case 1 : System.out.print("January 1, " + year + " is "); break;
			case 2 : System.out.print("February 1, " + year + " is "); break;
			case 3 : System.out.print("March 1, " + year + " is "); break;
			case 4 : System.out.print("April 1, " + year + " is "); break;
			case 5 : System.out.print("May 1, " + year + " is "); break;
			case 6 : System.out.print("June 1, " + year + " is "); break;
			case 7 : System.out.print("July 1, " + year + " is "); break;
			case 8 : System.out.print("August 1, " + year + " is "); break;
			case 9 : System.out.print("September 1, " + year + " is "); break;
			case 10 : System.out.print("October 1, " + year + " is "); break;
			case 11 : System.out.print("November 1, " + year + " is "); break;
			case 12 : System.out.print("December 1, " + year + " is "); break;
			}
		
			switch(firstDay % 7) {
			case 0 : System.out.print("Sunday\n"); break;
			case 1 : System.out.print("Monday\n"); break;
			case 2 : System.out.print("Tuesday\n"); break;
			case 3 : System.out.print("Wednesday\n"); break;
			case 4 : System.out.print("Thursday\n"); break;
			case 5 : System.out.print("Friday\n"); break;
			case 6 : System.out.print("Saturday\n"); break;
			}
		
			
			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10) {
				firstDay += 31;
			}else if(i == 4 || i == 6 || i == 9 || i == 11) {
				firstDay +=30;
			}else {
				if(isLeapYear) {
					firstDay += 29;
				}else {
					firstDay +=28;
				}
			}
		}
		

	}

}
