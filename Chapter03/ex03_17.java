package chapter03_ex;
import java.util.Scanner;

public class ex03_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper (2): ");
		int player = input.nextInt();
		input.close();
		
		if(player > 2) {
			System.out.println("Wrong input! Try again");
			System.exit(1);
		}
		
		int computer = (int)(Math.random() * 3);
		
		System.out.print("The computer is ");
		
		if(computer == 0) {
			System.out.print("scissor.");
			if(player == 0)
				System.out.print(" You are scissor too. It is a draw!");
			if(player == 1)
				System.out.print(" You are rock. You won!");
			if(player == 2)
				System.out.print(" You are paper. You lost!");
		}else if(computer == 1) {
			System.out.print("rock.");
			if(player == 0)
				System.out.print(" You are scissor. You lost!");
			if(player == 1)
				System.out.print(" You are rock too. It is a draw!");
			if(player == 2)
				System.out.print(" You are paper. You won!");
		}else if(computer == 2) {
			System.out.print("paper.");
			if(player == 0)
				System.out.print(" You are scissor. You won!");
			if(player == 1)
				System.out.print(" You are rock. You lost!");
			if(player == 2)
				System.out.print(" You are paper too. It is a draw!");
		}
		
	}

}
/*
(Game: scissor, rock, paper)
Write a program that plays the popular scissor–rock– paper game. 
(A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user 
or the computer wins, loses, or draws. Here are sample runs: 

scissor (0), rock (1), paper (2): 1 
The computer is scissor. You are rock. You won 
scissor (0), rock (1), paper (2): 2 
The computer is paper. You are paper too. It is a draw 
*/