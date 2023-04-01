package chapter04_ex;
import java.util.Scanner;

public class ex04_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter string s1: ");
		String s1 = input.next();
		System.out.print("Enter string s2: ");
		String s2 = input.next();
		input.close();
		//test strings
		//String s1 = "ABCD";
		//String s2 = "BC";
		//String s3 = "BDC";
		

		if(s1.contains(s2)) {
			System.out.println(s2 + " is a substring of " + s1);
		}else {
			System.out.println(s2 + " is not a substring of " + s1);
		}
		
	}

}
