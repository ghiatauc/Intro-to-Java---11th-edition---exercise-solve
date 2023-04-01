package chapter05_ex;
import java.util.Scanner;

public class ex05_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int studentNumber = input.nextInt();
		int count = 0;
		String highStudent = "";
		int highScore = 0;
		
		do {
			System.out.print("Enter student name: ");
			String name = input.next();
			System.out.print("Enter student score: ");
			int score = input.nextInt();
			
			if(score >= highScore) {
				highStudent = name;
				highScore = score;
			}
			
			count++;
		}while(count < studentNumber);
		
		input.close();
		
		System.out.println("The student " + highStudent + " has the highest score " + highScore);

	}

}
