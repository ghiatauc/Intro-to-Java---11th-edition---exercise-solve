package chapter02_ex;
import java.util.Scanner;

public class ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
		
		int numberUse = number;
		
		int n1 = numberUse % 10;
		numberUse /= 10;
		
		int n2 = numberUse % 10;
		numberUse /= 10;
		
		int n3 = numberUse;
		
		int multiplicator = n1 * n2 * n3;
				
				
		System.out.println("The multiplication of all digits in "+number+" is "+multiplicator);

	}

}
