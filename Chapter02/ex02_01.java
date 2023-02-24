package chapter02_ex;
import java.util.Scanner;

public class ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter miles: ");
		double miles = input.nextDouble();
		input.close();
		
		double kilometers = miles * 1.6;
		
		System.out.println(miles+" miles is "+(int)(kilometers*10)/10.0+" kilometers");
	}

}
/*
(Convert mile to kilometer)
Write a program that reads a mile in a double value from the console, converts it to kilometers, 
and displays the result. The formula for the conversion is as follows: 1 mile = 1.6 kilometers
*/