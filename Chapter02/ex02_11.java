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
		input.close();
		
		int populationFuture = population + years * oneYearSeconds / 7 - years * oneYearSeconds / 13 + years * oneYearSeconds / 45;
		
		System.out.println("The population in "+years+" is "+populationFuture);
	}

}
/*
(Population projection) 
Rewrite Programming Exercise 1.11 to prompt the user 
to enter the number of years and display the population after the number of years. 
Use the hint in Programming Exercise 1.11 for this program.
*/