package chapter03_ex;
import java.util.Scanner;

public class ex03_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int lottery =(int) (Math.random() * 1000);
		
		System.out.print("Enter your guess: ");
		int guess = input.nextInt();
		input.close();
		
		int lotteryDigit1 = lottery / 100;
		int lotteryDigit2 = lottery % 100;
		int lotteryDigit3 = lottery % 10;
		lotteryDigit2 /= 10;
		
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess % 100;
		int guessDigit3 = guess % 10;
		guessDigit2 /= 10;
		
		
		if(guess == lottery) {
			System.out.println("Exact match: you won $12,000");
		}else if((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) &&
				(guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit3 == lotteryDigit3) &&
				(guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)) {
			System.out.println("Match all digit: you won $3,000");
		}else if((guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) &&
				(guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) &&
				(guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3)) {
			System.out.println("Match all digit: you won $3,000");
		}else if((guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) &&
				(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) &&
				(guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)) {
			System.out.println("Match all digit: you won $3,000");
		}else if((guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) &&
				(guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) &&
				(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3)) {
			System.out.println("Match all digit: you won $3,000");
		}else if((guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) &&
				(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3) &&
				(guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3)) {
			System.out.println("Match all digit: you won $3,000");
		}else if((guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) &&
				(guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3) &&
				(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3)) {
			System.out.println("Match all digit: you won $3,000");
		}else if(guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 ||
				guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit3 == lotteryDigit3 ||
				guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
			System.out.println("Match one digit: you won $1,000");
		}else {
			System.out.println("Sorry no match, play again!");
		}
		
	}

}
/*
(Game: lottery)
Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit number. The program prompts 
the user to enter a three-digit number and determines whether the user wins according to the following rules: 
1. If the user input matches the lottery number in the exact order, the award is 
$12,000. 
2. If all digits in the user input match all digits in the lottery number, the award 
is $5,000. 
3. If one digit in the user input matches a digit in the lottery number, the award 
is $2,000.
*/