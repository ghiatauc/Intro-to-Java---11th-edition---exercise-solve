package chapter03_ex;
import java.util.Scanner;

public class ex03_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius =  10;
		double x1 = 0;
		double y1 = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		input.close();
		
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		
		if(distance <= radius) {
			System.out.println("Point ("+x2+", "+y2+") is in the circle");
		}else {
			System.out.println("Point ("+x2+", "+y2+") is not in the circle");
		}
		

	}

}

/*
Geometry: point in a circle?) 
Write a program that prompts the user to enter a point (x, y) and checks whether the point is within the circle centred at (0, 0) with 
radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the circle. A point is in the circle if its distance to 
(0, 0) is less than or equal to 10. The formula for computing the distance is 
						distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
*/