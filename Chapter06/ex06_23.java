package chapter06_ex;
import java.util.Scanner;

public class ex06_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String word = input.next();
		System.out.print("Enter the character: ");
		char ch = input.next().charAt(0);
		input.close();
		
		System.out.println("Character \"" + ch + "\" occurrences is " + count(word, ch));
		
		//System.out.println(count("america", 'a'));	//test value - return 2
	}
	
	public static int count(String str, char a) {
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == a) {
				count++;
			}
		}
		
		return count;
	}

}
