package chapter04_ex;
import java.util.Scanner;

public class ex04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		double b = 10;
		double c = 10;
		
		double A = 72;
		
		double a = Math.pow(b, 2) + Math.pow(c, 2) - 2 * b * c *Math.cos(Math.toRadians(A));
		System.out.println(a );
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of the bouding circle: ");
		double radius = input.nextDouble();
		
		/*
		double angleIncrement = Math.toRadians(360 / 5.0);
		
		double p1Angle = angleIncrement;
		double p2Angle = angleIncrement * 2;
		double p3Angle = angleIncrement * 3;
		double p4Angle = angleIncrement * 4;
		double p5Angle = angleIncrement * 5;
		
		System.out.printf("%8.4f, %.4f\n", radius * Math.sin(p1Angle) , radius * Math.cos(p1Angle));
		System.out.printf("%8.4f, %.4f\n", radius * Math.sin(p2Angle) , radius * Math.cos(p2Angle));
		System.out.printf("%8.4f, %.4f\n", radius * Math.sin(p3Angle) , radius * Math.cos(p3Angle));
		System.out.printf("%8.4f, %.4f\n", radius * Math.sin(p4Angle) , radius * Math.cos(p4Angle));
		System.out.printf("%8.4f, %.4f", radius * Math.sin(p5Angle) , radius * Math.cos(p5Angle));
		*/
		
		System.out.println("The coordinates of five points on the pentagon are:");
		
		double p1x = radius * Math.cos(Math.toRadians(18));
		double p1y = radius * Math.sin(Math.toRadians(18));
		
		System.out.printf("%8.4f, %8.4f\n", p1x, p1y);
		

	}

}
