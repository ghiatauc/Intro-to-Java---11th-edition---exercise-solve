package chapter05_ex;
import java.util.Scanner;

public class ex05_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int number = input.nextInt();
		input.close();
		
		//int number = 7; //test value
		
		for(int i = number; i > 0; i--) {
			for(int j = i; j > 1; j--) {
				System.out.print(j + " ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

	}

}
