package chapter06_ex;
import java.util.Scanner;

public class ex06_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter milliseconds: ");
		long millis = input.nextLong();
		input.close();
		
		System.out.print(convertMillis(millis));
		
		//System.out.println(convertMillis(5500)); //test value - return 0:0:5
		//System.out.println(convertMillis(100000)); //test value - return 0:1:40
		//System.out.println(convertMillis(555550000)); //test value - return 154:19:10

	}
	
	public static String convertMillis(long millis) {
		
		long totalSeconds = millis / 1000;
		
		long seconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long minutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		return totalHours + ":" + minutes + ":" + seconds; 
		
	}

}
