package chapter03_ex;
import java.util.Scanner;

public class ex03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double KILOGRAMS_PER_POUND = 0.453592237;
		final double METERS_PER_INCH = 0.0254;
		final double INCHES_PER_FOOT = 12;
		
		System.out.print("Enter weight in pounds: ");
		double weightInPounds = input.nextDouble();
		
		System.out.print("Enter feet: ");
		double heightFeet = input.nextDouble();
		
		System.out.print("Enter inches: ");
		double heightInches = input.nextDouble();
		input.close();
		
		double heightInInches = INCHES_PER_FOOT * heightFeet + heightInches;
		
		double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
		double heightInMeters = heightInInches * METERS_PER_INCH;
		
		double bmi = weightInKilograms / Math.pow(heightInMeters, 2);
		
		System.out.println("BMI is "+bmi);
		
		if(bmi < 18.5)
			System.out.println("Underweight");
		else if(bmi < 25)
			System.out.println("Normal");
		else if(bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");

	}

}
/*
(Health application: BMI)
Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user enter weight, feet, and inches. 
For example, if a person is 5 feet and 10 inches, you will enter 5 for feet and 10 for inches.
*/