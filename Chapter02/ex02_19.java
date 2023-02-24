package chapter02_ex;import java.util.Scanner;

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
		
		//de inversat minusul, aplicare modul
		double area = (x1 * (y2 -y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
		area = Math.abs(area);
		System.out.println("The are of the triangle is "+(int)(area * 100) / 100.0);
	}

}
