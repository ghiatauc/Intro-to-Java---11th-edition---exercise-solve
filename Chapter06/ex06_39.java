package chapter06_ex;
import java.util.Scanner;

public class ex06_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three points for p0, p1, and p2: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		input.close();
		
		//test values - returns on the line segment;
		//double x0 = 1; double y0 = 1; double x1 = 2; double y1 = 2; double x2 = 1.5; double y2 = 1.5;
		//test values - returns on the same line
		//double x0 = 1; double y0 = 1; double x1 = 2; double y1 = 2; double x2 = 3; double y2 = 3;
		//test values - returns on the left side
		//double x0 = 1; double y0 = 1; double x1 = 2; double y1 = 2; double x2 = 1; double y2 = 1.5;
		//test values - returns on the right side
		//double x0 = 1; double y0 = 1; double x1 = 2; double y1 = 2; double x2 = 1; double y2 = -1;
		
		printSolution(x0, y0, x1, y1, x2, y2);
		
	}
	
	public static void printSolution(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		System.out.print("(" + x2 + ", " + y2 + ") is on ");
		
		if(onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
			System.out.print("the line segment");
		}
		
		if(onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			System.out.print("the same line");
		}
		
		if(leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.print("the left side of the line\n\t");
		}
		
		if(!leftOfTheLine(x0, y0, x1, y1, x2, y2) && !onTheSameLine(x0, y0, x1, y1, x2, y2) && !onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
			System.out.print("the right side of the line\n\t");
		}
		
		
		System.out.print(" from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
		
	}
	
	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		return (position(x0, y0, x1, y1, x2, y2) == 0 ? true : false) && pointsDistance(x0, y0, x1, y1) < pointsDistance(x0, y0, x2, y2);
		
	}
	
	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		return (position(x0, y0, x1, y1, x2, y2) == 0 ? true : false) && pointsDistance(x0, y0, x1, y1) >= pointsDistance(x0, y0, x2, y2);
		
	}
	
	
	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		return position(x0, y0, x1, y1, x2, y2) != 0 && (position(x0, y0, x1, y1, x2, y2) > 0 ? true : false);
		
	}
	
	public static double position(double x0, double y0, double x1, double y1, double x2, double y2) {
		
		return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
	}
	
	public static double pointsDistance(double x0, double y0, double x1, double y1) {
		
		return Math.sqrt(Math.pow(x0 - x1, 2) + Math.pow(y0 - y1, 2));
		
	}

}
