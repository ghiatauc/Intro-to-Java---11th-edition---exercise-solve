package chapter05_ex;
import java.util.Scanner;

public class ex05_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers: ");
		int number;
		int count = 0;
		int max = 0;
		
		//3 5 2 5 5 5 0 //test value max = 5 and count = 4
		
		do {
			number = input.nextInt();
			
			if(number > max) {
				max = number;
				count = 1;
			}else if(number == max){
				count++;
			}
			
		}while(number > 0);
		
		input.close();
		
		System.out.println("The largest number is " + max + "\nThe occurence count for the largest number is " + count);

	}

}
