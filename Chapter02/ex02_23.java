package chapter02_ex;
import java.util.Scanner;

public class ex02_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		input.close();
		
		double costOfDriving = (distance / milesPerGallon) * pricePerGallon;
		
		System.out.println("The cost of driving is £"+(int)(costOfDriving * 100) / 100.0);
	}

}
/*
(Cost of driving) 
Write a program that prompts the user to enter the distance to 
drive, the fuel efficiency of the car in miles per gallon, and 
the price per gallon then displays the cost of the trip.
*/