package chapter03_ex;
import java.util.Scanner;

public class ex03_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		input.close();
		
		double distanceBetweenCenters = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		if(radius1 >= radius2) {
			if(distanceBetweenCenters <= radius1 - radius2) {
				System.out.println("Circle2 is inside circle1");
			}else if(distanceBetweenCenters <= radius1 + radius2) {
				System.out.println("Circle2 overlaps circle1");
			}else {
				System.out.println("Circle2 does not overlap circle1");
			}
		}
		
		if(radius2 > radius1) {
			if(distanceBetweenCenters <= radius2 - radius1) {
				System.out.println("Circle1 is inside circle2");
			}else if(distanceBetweenCenters <= radius1 + radius2) {
				System.out.println("Circle1 overlaps circle2");
			}else {
				System.out.println("Circle1 does not overlap circle2");
			}
		}
		
	}

}
/*
(Geometry: two circles)
Write a program that prompts the user to enter the centre coordinates and radius of two circles and determines whether the second 
circle is inside the first or overlaps with the first, as shown in Figure 3.10. Circle2 is inside circle1 if the distance between 
the two centres <= r1 - r2 and circle2 overlaps circle1 if the distance between the two centres <= r1 + r2.
*/