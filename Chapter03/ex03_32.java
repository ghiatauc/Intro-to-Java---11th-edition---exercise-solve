package chapter03_ex;
import java.util.Scanner;

public class ex03_32 {

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
		
		//left
		//double x0 = 1; double y0 = 1; double x1 = 2; double y1 = 2; double x2 = 1; double y2 = 1.5;
		//right
		//double x0 = 1; double y0 = 1; double x1 = 2; double y1 = 2; double x2 = 1; double y2 = -1;
		
		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if(position > 0) {
			System.out.println("p2 is on the left side of the line");
		}else if(position == 0) {
			System.out.println("p2 is on the same line");
		}else if(position < 0) {
			System.out.println("p2 is on the right side of the line");
		}

	}

}
/*
(Geometry: point position)
Given a directed line from point p0(x0, y0) to p1(x1, y1), you can use the following condition to decide whether 
a point p2(x2, y2) is on the left of the line, on the right, or on the same line:
						(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0)
		>0 p2 is on the left side of the line
		=0 p2 is on the same line
		<0 p2 is on the right side of the line
*/