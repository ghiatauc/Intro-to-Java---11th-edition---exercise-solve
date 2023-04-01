package chapter03_ex;
import java.util.Scanner;

public class ex03_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year: (e.g. 2012): ");
		int year = input.nextInt();
		//double year = input.nextDouble();
		
		System.out.print("Enter month: 1 - 12: ");
		int month = input.nextInt();
		
		System.out.print("Enter the day of the month: ");
		int day = input.nextInt();
		
		input.close();
		
		
		if(month == 1) {
			month = 13;
			year = year - 1;
		}
		
		if(month == 2) {
			month = 14;
			year = year - 1;
		}
		
		int q = day;
		int m = month;
		int j = year / 100;
		int k = year % 100;
		
		int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
		
		switch(h) {
		case 0 : System.out.println("The day of the week is Saturday"); break;
		case 1 : System.out.println("The day of the week is Sunday"); break;
		case 2 : System.out.println("The day of the week is Monday"); break;
		case 3 : System.out.println("The day of the week is Tuesday"); break;
		case 4 : System.out.println("The day of the week is Wednesday"); break;
		case 5 : System.out.println("The day of the week is Thursday"); break;
		case 6 : System.out.println("The day of the week is Friday"); break;
		}
		
	}

}

/*
(Science: day of the week)
Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is 
				h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
where 
h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, and 6: Friday). 
q is the day of the month. 
m is the month (3: March, 4: April, . . ., 12: December). January and February are counted as months 13 and 14 of the previous year. 
j is year / 100 
k is the year of the century (i.e., year % 100)
*/
