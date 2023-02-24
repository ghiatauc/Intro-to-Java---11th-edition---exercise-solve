package chapter01_ex;

public class exercise_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distanceMiles = 24;
		double hours = 1;
		double minutes = 40;
		double seconds = 35;
		
		double timeInSeconds = seconds + minutes * 60 + hours * 60 * 60;
		double distanceKilometers = distanceMiles * 1.6;
		
		double average = (distanceKilometers * 3600) / timeInSeconds;
		
		System.out.println("The average speed in km/h is "+average);
	}

}
/*
(Average speed in kilometers)
Assume that a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a program that displays the average speed in 
kilometers per hour. (Note 1 mile is equal to 1.6 kilometers)
*/
