package chapter03_ex;
import java.util.Scanner;

public class ex03_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter temperature in F: ");
		double temperature = input.nextDouble();
		
		System.out.print("Enter wind speed: ");
		double windSpeed = input.nextDouble();
		
		if((temperature  > -58 && temperature < 41) && windSpeed >= 2) {
			double windChillIndex = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
			
			System.out.println("The wind childd index is "+(int)(windChillIndex * 100000) / 100000.0);
		}else {
			System.out.println("Temperature and/or wind speed is invalid");
		}
		
		input.close();
	}

}
/*
(Science: wind-chill temperature)
Programming Exercise 2.17 gives a formula to compute the wind-chill temperature. The formula is valid for temperatures 
in the range between -58°F and 41°F and wind speed greater than or equal to 2. 
Write a program that prompts the user to enter a temperature and a wind speed. 
The program displays the wind-chill temperature if the input is valid; otherwise, it displays a message indicating 
whether the temperature and/or wind speed is invalid. 
*/