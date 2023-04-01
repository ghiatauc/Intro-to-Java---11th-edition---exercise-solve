package chapter06_ex;
import java.util.Scanner;

public class ex06_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		input.close();
		
		//int number = 3456; //test value return 6543
		reverse(number);

	}
	
	public static void reverse(int number) {
		while(number != 0) {
			System.out.print(number % 10);
			number /= 10;
		}
	}

}
