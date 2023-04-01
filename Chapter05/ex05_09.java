package chapter05_ex;
import java.util.Scanner;

public class ex05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		System.out.println();
		
		if(numberOfStudents < 2) {
			System.out.println("Error. Need more students!");
			System.exit(0);
		}
		
		String student0 = "";
		int score0 = 99;
		
		String student1 = "";
		int score1 = 100;
		
		for(int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter name and score: ");
			String name = input.next();
			int score = input.nextInt();
			
			if(score < score1) {
				if(score < score0) {
					String tempN = student0;
					int tempS = score0;
					student0 = name;
					score0 = score;
					student1 = tempN;
					score1 = tempS;
				}else {
					student1 = name;
					score1 = score;
				}
			}
		}
		input.close();
		
		System.out.print("\nLast two student are\nName: " + student1 + " score: " +score1
				+ "\nName: " + student0 + " score: " + score0);

	}

}
