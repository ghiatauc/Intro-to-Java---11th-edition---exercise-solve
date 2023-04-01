package chapter03_ex;
import java.util.Scanner;

public class ex03_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		input.close();
		
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		double a = y1 - y2;
		double b = x1 - x2;
		b = -b;
		
		double c = y3 - y4;
		double d = x3 - x4;
		d = -d;
		
		boolean hasSolution = a * d - b * c != 0;
		
		if(hasSolution) {
			double x = (e * d - b * f) / (a * d - b * c);
			double y = (a * f - e * c) / (a * d - b * c);
			
			x = ((int)(x * 100000)) / 100000.0;
			y = ((int)(y * 100000)) / 100000.0;
			
			System.out.println("The intersecting point is at ("+x+", "+y+")");
		}else {
			System.out.println("The two lines are parallel");
		}
		
	}

}

/*
(Geometry: intersecting point)
Two points on line 1 are given as (x1, y1) and (x2, y2) and on line 2 as (x3, y3) and (x4, y4)
The intersecting point of the two lines can be found by solving the following linear equations:
 			(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 			(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
This linear equation can be solved using Cramer’s rule (see Programming Exercise 3.3). 
If the equation has no solutions, the two lines are parallel.
*/
