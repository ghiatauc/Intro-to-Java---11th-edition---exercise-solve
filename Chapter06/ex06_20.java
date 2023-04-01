package chapter06_ex;
import java.util.Scanner;

public class ex06_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.next();
		input.close();
		
		//String str = "amer854ica"; //test value - return 7
		//String str = "iMac"; //test value - return 4
		System.out.println("Number of letters in word \"" + str + "\" is " + countLetters(str));

	}
	
	public static int countLetters(String s) {
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		
		return count;
	}

}
