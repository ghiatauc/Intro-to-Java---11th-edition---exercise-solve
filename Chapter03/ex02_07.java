package chapter02_ex;
import java.util.Scanner;

public class ex02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		input.close();
		
		//calculate days
		int minutesPerDay = 24 * 60;
		int days = minutes / minutesPerDay;
		
		//calculate years
		int years = days / 365;
		int daysRemaining = days % 365;
		
		System.out.println(minutes+" minutes is approximately "+years+" years and "+daysRemaining+" days");
	}

}
/*
(Find the number of years) 
Write a program that prompts the user to enter the minutes (e.g., 1 billion), 
and displays the number of years and remaining days for the minutes. 
For simplicity, assume that a year has 365 days.
*/