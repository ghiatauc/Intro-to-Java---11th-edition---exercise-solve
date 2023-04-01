package chapter05_ex;
import java.util.Scanner;

public class ex05_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int lotteryDigit1 = (int)(Math.random() * 10);
		int lotteryDigit2 = lotteryDigit1;

		while(lotteryDigit2 == lotteryDigit1) {
			lotteryDigit2 = (int)(Math.random() * 10);
		}
		
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		input.close();
		
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is " + lotteryDigit1 + "" +lotteryDigit2);
		
		if(lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2)
			System.out.println("Exact match: you win $10,000");
		else if(lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1)
			System.out.println("Match all digits: you win $3,000");
		else if(lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2
				|| lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");
		
		
	}

}
