package chapter02_ex;
import java.util.Scanner;

public class ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number of square meters: ");
		double squareMeters = input.nextDouble();
		input.close();
		
		double pings = squareMeters * 0.3025;
		
		System.out.println(squareMeters+" square meters is "+(int)(pings * 1000) / 1000.0+" pings");
	}

}
/*
(Convert square meter into ping) 
Write a program that converts square meter into ping. 
The program prompts the user to enter a number in square meter, converts it to ping, 
and displays the result. One square meter is 0.3025 ping.
*/