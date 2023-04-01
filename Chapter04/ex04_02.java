package chapter04_ex;
import java.util.Scanner;

public class ex04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double RADIUS = 6371.01;
		
		System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		double latitude1 = input.nextDouble();
		double longitude1 = input.nextDouble();
		
		System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		double latitude2 = input.nextDouble();
		double longitude2 = input.nextDouble();
		
		input.close();
		
		//toRadians angle
		double latitude1ToRadians = Math.toRadians(latitude1);
		double longitude1ToRadians = Math.toRadians(longitude1);
		double latitude2ToRadians = Math.toRadians(latitude2);
		double longitude2ToRadians = Math.toRadians(longitude2);
		
		
		
		
		
		double greatDistance = RADIUS * Math.acos(Math.sin(latitude1ToRadians) * Math.sin(latitude2ToRadians) + 
		Math.cos(latitude1ToRadians) * Math.cos(latitude2ToRadians) * Math.cos(longitude1ToRadians - longitude2ToRadians));
		
		System.out.printf("The distance between the two points is %.2f km",greatDistance);
		
	}

}
