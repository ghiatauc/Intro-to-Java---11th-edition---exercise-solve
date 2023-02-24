package chapter02_ex;
import java.util.Scanner;

public class ex02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double length = Math.pow(speed, 2) / (2 * acceleration);
		
		System.out.println("The minimum runway length for this airplane is "+(int)(length * 1000) / 1000.0);
		

	}

}
