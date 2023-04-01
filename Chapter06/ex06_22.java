package chapter06_ex;
import java.util.Scanner;

public class ex06_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long number = input.nextLong();
		input.close();
		
		//long number = 25L;  //test value - return 5.0
		System.out.println("The square root of " + number + " is " + sqrt(number));

	}
	
	public static double sqrt(long n) {
		double nextGuess;
		double lastGuess = 1.0;
		double difference;
		
		do {
			nextGuess = (lastGuess + (n / lastGuess)) / 2.0;
			difference = Math.abs(nextGuess - lastGuess);
			lastGuess = nextGuess;
		}while(difference > 1E-7);
		
		return nextGuess;
	}

}
