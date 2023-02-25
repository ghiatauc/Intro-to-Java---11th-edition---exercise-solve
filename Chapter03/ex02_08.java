package chapter02_ex;
import java.util.Scanner;

public class ex02_08 {

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
		
		//should add if statement if time is bigger than 24
		
		System.out.println("Current time is "+(currentHour+offset)+":"+currentMinute+":"+currentSecond+" GMT");
	}

}
/*
(Current time) 
Listing 2.7, ShowCurrentTime.java, gives a program that displays 
the current time in GMT. Revise the program so it prompts the user to enter the 
time zone offset to GMT and displays the time in the specified time zone.
*/
