package chapter06_ex;
import java.util.Scanner;

public class ex06_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.next();
		input.close();
		
		//String str = "1-800-Flowers";  //test value - return 1-800-3569377
		//String str = "1800flowers";  //test value - return 18003569377
		
		String number = "";
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isLetterOrDigit(ch)) {
				if(Character.isDigit(ch)) {
					number = number + ch;
				}
				
				if(Character.isLetter(ch)) {
					ch = Character.toUpperCase(ch);
					number = number + getNumber(ch);
				}
			}else {
				number = number + ch;
			}
			
		}
		
		System.out.println(number);
 
	}
	
	public static int getNumber(char uppercaseLetter) {
		
		if(uppercaseLetter == 'A' || uppercaseLetter == 'B' || uppercaseLetter == 'C') {
			return 2;
		} else if(uppercaseLetter == 'D' || uppercaseLetter == 'E' || uppercaseLetter == 'F') {
			return 3;
		} else if(uppercaseLetter == 'G' || uppercaseLetter == 'H' || uppercaseLetter == 'I') {
			return 4;
		} else if(uppercaseLetter == 'J' || uppercaseLetter == 'K' || uppercaseLetter == 'L') {
			return 5;
		} else if(uppercaseLetter == 'M' || uppercaseLetter == 'N' || uppercaseLetter == 'O') {
			return 6;
		} else if(uppercaseLetter == 'P' || uppercaseLetter == 'Q' || uppercaseLetter == 'R' || uppercaseLetter == 'S') {
			return 7;
		} else if(uppercaseLetter == 'T' || uppercaseLetter == 'U' || uppercaseLetter == 'V') {
			return 8;
		} else if(uppercaseLetter == 'W' || uppercaseLetter == 'X' || uppercaseLetter == 'Y' || uppercaseLetter == 'Z') {
			return 9;
		} 
		
		return -1;
		
	}

}
