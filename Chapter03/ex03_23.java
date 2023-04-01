package chapter03_ex;
import java.util.Scanner;

public class ex03_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		input.close();
		double xPrint = x;
		double yPrint = y;
		
		double width = 10;
		double height = 5;
		
		if(x < 0) {
			x = -x;
		}
		
		if(y < 0) {
			y = -y;
		}
		
		if(x <= width / 2 && y <= height) {
			System.out.println("Point ("+xPrint+", "+yPrint+") is in the rectangle");
		}else {
			System.out.println("Point ("+xPrint+", "+yPrint+") is not in the rectangle");
		}

	}

}

/*
(Geometry: point in a rectangle)
Write a program that prompts the user to enter a point (x, y) and checks whether the point is within the rectangle centred 
at (1, 1) with width 10 and height 5. For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle. 
A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its vertical distance 
to (0, 0) is less than or equal to 5.0 / 2.
*/
