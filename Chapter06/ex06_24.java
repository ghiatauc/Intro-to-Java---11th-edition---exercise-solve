package chapter06_ex;

public class ex06_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDateAndTime();
	}
	
	public static void printDateAndTime() {
		long totalMilliseconds = System.currentTimeMillis();
		
		System.out.println("Current date and time is " + findDate(totalMilliseconds) + "  " + findTime(totalMilliseconds));
	}
	
	public static String findTime(long totalMilliseconds) {
		long totalSeconds = totalMilliseconds / 1000;
		//current second
		long currentSecond = totalSeconds % 60;
		//total minutes
		long totalMinutes = totalSeconds / 60;
		//current minute
		long currentMinute = totalMinutes % 60;
		//total hours
		long totalHours = totalMinutes / 60;
		//current hour
		long currentHour = totalHours % 24;
		
		String time = currentHour+":"+currentMinute+":"+currentSecond;
		
		return time;
	}
	
	
	public static String findDate(long totalMilliseconds) {
		long days = totalMilliseconds / 86400000;
		
		int startYear = 1970;
		
		while(days > 365) {
			if(isLeapYear(startYear)) {
				days -= 366;
			}else {
				days -= 365;
			}
			startYear++;
		}
		
		int month = 1;
		
		while(days > 30) {
			days -= getNumberOfDaysInMonth(startYear, month);
			month++;
		}//November has 30 days
		
		String date = getMonthName(month) + " " + (days + 1) +", " + startYear;		//add one day which is the current day
		
		return date;
	}
	
	public static String getMonthName(int month) {
		String monthName = "";
		
		switch(month) {
		case 1: monthName = "January"; break;
		case 2: monthName = "February"; break;
		case 3: monthName = "March"; break;
		case 4: monthName = "April"; break;
		case 5: monthName = "May"; break;
		case 6: monthName = "June"; break;
		case 7: monthName = "July"; break;
		case 8: monthName = "August"; break;
		case 9: monthName = "September"; break;
		case 10: monthName = "October"; break;
		case 11: monthName = "November"; break;
		case 12: monthName = "December"; break;
		}
		
		return monthName;
	}
	
	public static int getNumberOfDaysInMonth(int year, int month) {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;
		
		if(month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		
		if(month == 2)
			return isLeapYear(year) ? 29 : 28;
		
		return 0;
		
	}
	
	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
