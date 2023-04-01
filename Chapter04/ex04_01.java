package chapter04_ex;
import java.util.Scanner;

public class ex04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the conter to a vertex: ");
		double length = input.nextDouble();
		input.close();
		
		double side = 2 * length * Math.sin(Math.PI / 5);
		
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.printf("The area of the pentagon is %.2f",area);
		
	}

}
