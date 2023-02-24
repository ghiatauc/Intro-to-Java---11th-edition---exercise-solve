package chapter02_ex;
import java.util.Scanner;

public class ex02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int population = 312032486;
		int oneYearSeconds = 365 * 24 * 60 * 60;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();
		
		int populationFuture = population + years * oneYearSeconds / 7 - years * oneYearSeconds / 13 + years * oneYearSeconds / 45;
		
		System.out.println("The population in "+years+" is "+populationFuture);
		

	}

}
