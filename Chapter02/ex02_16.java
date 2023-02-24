package chapter02_ex;
import java.util.Scanner;

public class ex02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the side: ");
		double length = input.nextDouble();
		input.close();
		
		double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(length, 2);
		
		System.out.println("The area of the hexagon is: "+(int)(area * 10000) / 10000.0);
	}

}
/*
(Geometry: area of a hexagon) 
Write a program that prompts the user to enter the 
side of a hexagon and displays its area. The formula for computing the area of a 
hexagon is area = ((3 * sqrt(3)) / 2) * s^2
 where s is the length of a side.
*/