package chapter05_ex;
import java.util.Scanner;

public class ex05_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		input.close();
		
		int div = 2;
		
		System.out.print("Factors for " + number + " are: ");
		
		while(number  != 1) {
			
			if(number % div == 0) {
				System.out.print(div + " ");
				number /= div;
			}else {
				div++;
			}
			
		}
		
	}

}
