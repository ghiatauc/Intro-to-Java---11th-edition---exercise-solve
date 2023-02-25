package chapter03_ex;
import java.util.Scanner;

public class ex03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double game = Math.random();
		
		int headsOrTails = game < 0.5 ? 0 : 1;
		
		System.out.print("Enter 0 for head or 1 for tail: ");
		int guess = input.nextInt();
		input.close();
		
		if(headsOrTails == guess) {
			System.out.println("Your guess is correct");
		}else {
			System.out.println("Your guess is incorrect");
		}
		
	}

}
/*
(Game: heads or tails) 
Write a program that lets the user guess whether the flip of a coin results in heads or tails. 
The program randomly generates an integer 0 or 1, which represents head or tail. 
The program prompts the user to enter a guess, and reports whether the guess is correct or incorrect.
*/