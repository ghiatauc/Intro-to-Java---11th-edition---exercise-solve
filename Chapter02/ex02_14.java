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
		input.close();
		
		double weightKilograms = weightPounds * 0.45359237;
		double heightMeters = heightInches * 0.0254;
		
		double BMI = weightKilograms / Math.pow(heightMeters, 2);
		
		System.out.println("BMI is "+(int)(BMI * 10000) / 10000.0);
	}

}
/*
(Health application: computing BMI) 
Body Mass Index (BMI) is a measure of 
health on weight. It can be calculated by taking your weight in kilograms and 
dividing, by the square of your height in meters. Write a program that prompts the 
user to enter a weight in pounds and height in inches and displays the BMI. Note 
one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/