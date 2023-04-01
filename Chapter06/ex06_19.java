package chapter06_ex;
import java.util.Scanner;

public class ex06_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3  sides for triangle: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();
		
		//double a = 3; double b = 4; double c = 5;  //test values - valid input and area = 6
		//double a = 1; double b = 4; double c = 5;  //test values - invalid input
		
		if(isValid(a, b, c)) {
			System.out.printf("The area of triangle is %.2f",area(a, b, c));
		}else {
			System.out.print("Invalid input");
		}

	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		
		if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
			return true;
		}
		
		return false;
	}
	
	public static double area(double side1, double side2, double side3) {
		
		double s = (side1 + side2 + side3) / 2.0;
		
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return area;
	}

}
