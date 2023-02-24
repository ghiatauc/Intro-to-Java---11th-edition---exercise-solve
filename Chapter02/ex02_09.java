package chapter02_ex;
import java.util.Scanner;

public class ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter v0, v1, and t: ");
		
		double v0 = input.nextDouble();
		double v1 = input.nextDouble();
		double t = input.nextDouble();
		
		double acceleration = (v1 - v0) / t;
		
		System.out.println("The average acceleration is "+(int)(acceleration * 10000) / 10000.0);

	}

}
