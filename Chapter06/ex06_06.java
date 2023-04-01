package chapter06_ex;
import java.util.Scanner;

public class ex06_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		input.close();
		
		//int number = 5; //test value
		displayPattern(number);

	}
	
	public static void displayPattern(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("%-3d", j);
			}
			System.out.println();
		}
	}

}
