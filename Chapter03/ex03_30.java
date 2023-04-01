package chapter03_ex;
import java.util.Scanner;

public class ex03_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		input.close();
		
        long totalMilliseconds = System.currentTimeMillis();
		
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
		
		long offsetTime = currentHour + offset;
		
		if(offsetTime > 23) {
			offsetTime -= 24;
		}
		
		if(offsetTime < 0) {
			offsetTime += 24;
		}
		
		if(offsetTime > 12) {
			long displayHour = offsetTime % 12;
			System.out.println("Current time is "+displayHour+":"+currentMinute+":"+currentSecond+" PM");
		}else {
			System.out.println("Current time is "+offsetTime+":"+currentMinute+":"+currentSecond+" AM");
		}
		

	}

}
/*
(Current time)
Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.
 */