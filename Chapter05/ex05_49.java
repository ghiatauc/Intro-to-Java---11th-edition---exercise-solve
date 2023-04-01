package chapter05_ex;
import java.util.Scanner;

public class ex05_49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		input.close();
		
		//String s = "Programming is fun";  //test value vowels 5 consonants 11
		int vowelCount = 0;
		int consonantCount = 0;
		s = s.toUpperCase();
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				if(s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
					vowelCount++;
				}else {
					consonantCount++;
				}
			}
		}
		System.out.println("The number of vowels is " +vowelCount + "\nThe number of consonants is " +consonantCount);

	}

}
