package chapter03_ex;
import java.util.Scanner;

public class ex03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number1 = (int)(Math.random() * 1000);
		int number2 = (int)(Math.random() * 1000);
		
		System.out.print("What is "+number1+" x "+number2+"? ");
		int answer = input.nextInt();
		input.close();
		
		if(number1 * number2 == answer) {
			System.out.println("You are correct!");
		}else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1+" x "+number2+" should be "+(number1 * number2));
		}

	}

}
/*
(Game: multiplication quiz)
Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question. 
Revise the program to randomly generate a multiplication question with two integers less than 1000.
*/