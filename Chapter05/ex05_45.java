package chapter05_ex;
import java.util.Scanner;

public class ex05_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 2 3 4.5 5.6 6 7 8 9 10 //test value mean = 5.61 deviation = 2.99794
		//v2 ask the user to input how many values....change for-loop
		Scanner input = new Scanner(System.in);
		double sumX = 0;
		double sumXPow2 = 0;
		
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < 10; i++) {
			double number = input.nextDouble();
			sumX += number;
			sumXPow2 += Math.pow(number, 2);
		}
		input.close();
		
		double mean = sumX / 10.0;
		
		double deviation = Math.sqrt((sumXPow2 - (Math.pow(sumX, 2) / 10.0)) / (10 - 1));
		
		System.out.println("Mean is " + mean);
		System.out.printf("The standard deviation is %.5f",deviation);
		

	}

}
