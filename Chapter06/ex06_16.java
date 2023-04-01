package chapter06_ex;

public class ex06_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of year's days");
		
		for(int i = 2014; i <= 2034; i++) {
			System.out.println(i + " has " + numberOfDaysInAYear(i) + " days");
		}

	}
	
	public static int numberOfDaysInAYear(int year) {
		
		if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ) {
			return 366;
		}
		
		return 365;
	}

}
