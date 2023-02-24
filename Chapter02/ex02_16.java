package chapter02_ex;
import java.util.Scanner;

public class ex02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the side: ");
		double length = input.nextDouble();
		
		double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(length, 2);
		
		System.out.println("The area of the hexagon is: "+(int)(area * 10000) / 10000.0);

	}

}
