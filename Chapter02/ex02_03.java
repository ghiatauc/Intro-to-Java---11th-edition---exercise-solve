package chapter02_ex;
import java.util.Scanner;

public class ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a value for meter: ");
		double meters = input.nextDouble();
		input.close();
		
		double feets = 3.2786 * meters;
		
		System.out.println(meters+" meters is "+(int)(feets * 1000) / 1000.0+" feets");
	}

}
/*
(Convert meters into feet) 
Write a program that reads a number in meters, converts 
it to feet, and displays the result. One meter is 3.2786 feet.
*/