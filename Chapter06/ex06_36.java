package chapter06_ex;
import java.util.Scanner;

public class ex06_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(area(5, 6.5));		//test value area = 72.69017017488385
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		int numberOfSides = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		input.close();
		
		System.out.println("Area of the polygon is " + area(numberOfSides, side));
		
	}
	
	public static double area(int n, double side) {
		
		double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
		
		return area;
	}

}
