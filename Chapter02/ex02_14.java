package chapter02_ex;
import java.util.Scanner;;

public class ex02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weightPounds = input.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double heightInches = input.nextDouble();
		
		double weightKilograms = weightPounds * 0.45359237;
		double heightMeters = heightInches * 0.0254;
		
		double BMI = weightKilograms / Math.pow(heightMeters, 2);
		
		
		System.out.println("BMI is "+(int)(BMI * 10000) / 10000.0);

	}

}
