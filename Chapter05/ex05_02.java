package chapter05_ex;
import java.util.Scanner;

public class ex05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		int correctCount = 0;
		String output = "";
		
		long startTime = System.currentTimeMillis();
		
		while(count < 12) {
			int n1 = (int)(Math.random() * 13);
			int n2 = (int)(Math.random() * 13);
			
			System.out.print("What is " + n1 + " x " + n2 + " ? ");
			int answer = input.nextInt();
			
			if(n1 * n2 == answer) {
				System.out.println("You are correct!");
				correctCount++;
			}else {
				System.out.println("Your answer is wrong.\n" + n1 + " x " + n2 + " should be " + (n1 * n2));
			}
			
			output += n1 + " x " + n2 + " = " + answer + (n1 * n2 == answer ? " correct" : " wrong") + "\n";
			
			count++;
			
		}
		input.close();
		long endTime = System.currentTimeMillis();
		
		long testTime = (endTime - startTime) / 1000;
		
		System.out.println("\nCorrect count is " + correctCount);
		System.out.println("Test time was " + testTime + " seconds\n");
		System.out.println(output);
		

	}

}
