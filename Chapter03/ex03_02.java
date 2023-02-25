package chapter03_ex;
import java.util.Scanner;

public class ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random()*10);
		int number2 = (int)(Math.random()*10);
		int number3 = (int)(Math.random()*10);
		
		System.out.print("What is "+number1+" x "+number2+" x "+number3+"?: ");
		int answer = input.nextInt();
		input.close();
		
		System.out.println(number1+" x "+number2+" x "+number3+" = "+answer+" is "+(number1 * number2 * number3 == answer));
	}

}
/*
(Game: multiply three numbers)
The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the user to enter the product of these two 
integers. Revise the program to generate three single-digit integers and prompt the user to enter the 
multiplication of these three integers.
*/