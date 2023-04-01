package chapter05_ex;
import java.util.Scanner;

public class ex05_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the first day of year, as integer(Sunday-0, Monday-1...): "); //could find first day of year using formula
		int firstDay = input.nextInt();
		input.close();
		
		//int year = 2013;  //test value
		//int firstDay = 2;  //test value
		
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		String month = "";
		int days = 0;
		System.out.print("\n");
		
		for(int i = 1; i <= 12; i++) {
			switch(i) {
			case 1 : month = "January" ; days = 31; break;
			case 2 : month = "February" ; days = isLeapYear ? 29 : 28; break;
			case 3 : month = "March" ; days = 31; break;
			case 4 : month = "April" ; days = 30; break;
			case 5 : month = "May" ; days = 31; break;
			case 6 : month = "June" ; days = 30; break;
			case 7 : month = "July" ; days = 31; break;
			case 8 : month = "August" ; days = 31; break;
			case 9 : month = "September" ; days = 30; break;
			case 10 : month = "October" ; days = 31; break;
			case 11 : month = "November" ; days = 30; break;
			case 12 : month = "December" ; days = 31; break;
			}
			
			System.out.printf("%16s %-16d\n",month,year);
			System.out.print("---------------------------------\n");
			
			System.out.printf("Sun  Mon  Tue  Wed  Thu  Fri  Sat\n");
			
			for(int j = 0; j < firstDay; j++) {
				System.out.printf("%3s  ","");
			}
			for(int k = 1 ; k <= days; k++) {
				System.out.printf("%3d  ",k);
				if((firstDay + k) % 7 == 0) {
					System.out.println();
				}
			}
			                                  
			System.out.print("\n\n");
			
			firstDay = (firstDay + days) % 7;
			
		}
		
	}

}
