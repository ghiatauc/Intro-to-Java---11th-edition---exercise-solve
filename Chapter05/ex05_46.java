package chapter05_ex;
import java.util.Scanner;

public class ex05_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.next();
		input.close();
		
		//String s ="ABCD"; //test value 
		
		String reverse = "";
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			reverse = ch + reverse;
		}
		
		System.out.println("The reversed string is " + reverse);

	}

}
