package chapter02_ex;
import java.util.Scanner; 

public class ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
		double length = input.nextDouble();
		
		double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);
		double volume = area * length;
		
		System.out.println("The area is "+(int)(area * 100) / 100.00);
		System.out.println("The volume of the Triangular prism is "+(int)(volume * 100) / 100.0);
		

	}

}
