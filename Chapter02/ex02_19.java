package chapter02_ex;
import java.util.Scanner;

public class ex02_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		input.close();
		
		double side12 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double side13 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double side23 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		
		double s = (side12 + side13 + side23) / 2.0;
		
		//sqrt of number is same as number^0.5
		double area = Math.pow(s * (s - side12) * (s - side13) * (s - side23), 0.5);
		
		System.out.println("The are of the triangle is " + area);
	}

}
/*
(Geometry: area of a triangle) 
Write a program that prompts the user to enter three 
points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area. 
The formula for computing the area of a triangle is
		s = (side1 + side2 + side3)/2;
	area = sqrt of s(s - side1)(s - side2)(s - side3)
*/
