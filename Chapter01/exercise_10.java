package chapter01_ex;

public class exercise_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distance = 15;
		double timeMinutes = 50;
		double timeSeconds = 30;
		
		double time = timeMinutes * 60 + timeSeconds;
		
		double distancePerHour = (distance * 3600) / time;
		
		double averageSpeedMilesPerHour = distancePerHour / 1.6;
		
		System.out.println("Running 15 km in 50 minutes and 30 seconds means an"
				+ " average speed of " + averageSpeedMilesPerHour + " miles/h");
	}

}
/*
(Average speed in miles)
Assume that a runner runs 15 kilometers in 50 minutes and 30 seconds. Write a program that displays the average speed in miles per hour. 
(Note that 1 mile is 1.6 kilometers)
*/
