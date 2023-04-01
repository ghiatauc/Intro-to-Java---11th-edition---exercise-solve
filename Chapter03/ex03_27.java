package chapter03_ex;
import java.util.Scanner;

public class ex03_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coordinates: ");
		double xp = input.nextDouble();
		double yp = input.nextDouble();
		
		input.close();
		
		double xa = 0;
		double ya = 0;
		double xb = 0;
		double yb = 100;
		double xc = 200;
		double yc = 0;
		
		double area_ABC = (xa * (yb - yc) + xb * (yc - ya) + xc * (ya - yb)) / 2.0;
		if(area_ABC < 0) {
			area_ABC = -area_ABC;
		}
		
		double area_ABP = (xa * (yb - yp) + xb * (yp - ya) + xp * (ya - yb)) / 2.0;
		if(area_ABP < 0) {
			area_ABP = -area_ABP;
		}
		
		double area_APC = (xa * (yp - yc) + xp * (yc - ya) + xc * (ya - yp)) / 2.0;
		if(area_APC < 0) {
			area_APC = -area_APC;
		}
		
		double area_PBC =(xp * (yb - yc) + xb * (yc - yp) + xc * (yp - yb)) / 2.0;
		if(area_PBC < 0) {
			area_PBC = -area_PBC;
		}
		
		if(area_ABC == area_ABP + area_APC + area_PBC) {
			System.out.println("The point is in the triangle");
		}else {
			System.out.println("The point is not in the triangle");
		}


	}

}

/*
(Geometry: points in triangle)
Suppose a right triangle is placed in a plane as shown below. The right-angle point is placed at (0, 0), 
and the other two points are placed at (200, 0) and (0, 100). Write a program that prompts the user to enter 
a point with x- and y-coordinates and determines whether the point is inside the triangle.
*/
