package chapter05_ex;
import java.util.Scanner;

public class ex05_48 {

	public static void main(String[] args) {
		//need more work
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = input.nextLine();
		input.close();
		
		//String word = "Beijing Chicago Cracovia";  //test values
		int start = 0;
		String subWord = "";
		
		for(int i = 0; i < word.length(); i++) {
			
			if(word.charAt(i) == ' ') {
				subWord = word.substring(start, i);
				for(int k = 1; k < subWord.length(); k = k + 2) {
					System.out.print(subWord.charAt(k));
				}
				start = i + 1;
			}
			
		}
		
		subWord = word.substring(start, word.length());
		for(int k = 1; k < subWord.length(); k = k + 2) {
			System.out.print(subWord.charAt(k));
		}

	}

}
