package chapter03_ex;
import java.util.Scanner;

public class ex03_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double perimeter;
		
		System.out.print("Enter the edges of triangle: ");
		
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		input.close();
		
		boolean isValid = (s1 + s2) > s3 && (s2 + s3) > s1 && (s1 + s3) > s2;
		
		
		
		if(isValid) {
			perimeter = s1 + s2 +s3;
			System.out.println("The perimeter of triangle is "+perimeter);
		}else {
			System.out.println("Invalid input!");
		}
			
		/*
		double xa = input.nextDouble();
		double ya = input.nextDouble();
		
		double xb = input.nextDouble();
		double yb = input.nextDouble();
		
		double xc = input.nextDouble();
		double yc = input.nextDouble();
		
		double ab = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
		double bc = Math.sqrt(Math.pow(xb - xc, 2) + Math.pow(yb - yc, 2));
		double ac = Math.sqrt(Math.pow(xa - xc, 2) + Math.pow(ya - yc, 2));
		*/
		//boolean isValid = ab + 
		//input.close();

	}

}
/*
(Compute the perimeter of a triangle)
Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. 
Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges 
is greater than the remaining edge. 
*/
