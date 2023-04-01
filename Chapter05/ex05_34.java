package chapter05_ex;
import java.util.Scanner;

public class ex05_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int computerWinCount = 0;
		int humanWinCount = 0;
		
		while(computerWinCount < 3 && humanWinCount < 3) {
			int player = -1;
			
			while(player < 0 || player > 2) {
				System.out.print("scissor (0), rock (1), paper (2): ");
				player = input.nextInt();
			}
			
			int computer = (int)(Math.random() * 3);
			
			System.out.print("The computer is ");
			
			if(computer == 0) {
				System.out.print("scissor.");
				if(player == 0) {
					System.out.print(" You are scissor too. It is a draw!");
				}
				if(player == 1) {
					System.out.print(" You are rock. You won!");
					humanWinCount++;
				}
				if(player == 2) {
					System.out.print(" You are paper. You lost!");
					computerWinCount++;
				}
					
			}else if(computer == 1) {
				System.out.print("rock.");
				if(player == 0) {
					System.out.print(" You are scissor. You lost!");
					computerWinCount++;
				}
				if(player == 1) {
					System.out.print(" You are rock too. It is a draw!");
				}
				if(player == 2) {
					System.out.print(" You are paper. You won!");
					humanWinCount++;
				}
			}else if(computer == 2) {
				System.out.print("paper.");
				if(player == 0) {
					System.out.print(" You are scissor. You won!");
					humanWinCount++;
				}
				if(player == 1) {
					System.out.print(" You are rock. You lost!");
					computerWinCount++;
				}
				if(player == 2) {
					System.out.print(" You are paper too. It is a draw!");
				}
					
			}
			
			System.out.println();
			
		}
		
		input.close();
		
		System.out.println();
		if(computerWinCount == 3) {
			System.out.println("The computer won the match");
		}else {
			System.out.println("You won the match");
		}
		
	}

}
