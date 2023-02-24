package chapter02_ex;
import java.util.Scanner;

public class ex02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		int minutes = input.nextInt();
		
		//calculate days
		int minutesPerDay = 24 * 60;
		int days = minutes / minutesPerDay;
		
		//calculate years
		int years = days / 365;
		int daysRemaining = days % 365;
		
		System.out.println(minutes+" minutes is approximately "+years+" years and "+daysRemaining+" days");
		

	}

}
