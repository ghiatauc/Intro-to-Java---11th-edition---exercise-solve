package chapter02_ex;
import java.util.Scanner;

public class ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilogrames: ");
		double water = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double energy = water * (finalTemperature - initialTemperature) * 4184;
		
		System.out.println("The energy needed is "+energy);

	}

}
