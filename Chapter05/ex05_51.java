package chapter05_ex;
import java.util.Scanner;

public class ex05_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String first = input.nextLine();
		System.out.print("Enter the second string: ");
		String second = input.nextLine();
		input.close();
		
		//test values - common prefix is Welcome to
		//String first = "Welcome to C++";
		//String second = "Welcome to programming";
		
		//test values = no common prefix
		//String first = "Atalanta";
		//String second = "Macon";
		
		int max = first.length();
		
		if(second.length() > max) {
			max = second.length();
		}
		
		int count = 0;
		
		for(int i = 0; i < max; i++) {
			if(first.charAt(i) != second.charAt(i)) {
				break;
			}
			count++;
		}
		
		if(count == 0) {
			System.out.println(first + " and " + second + " have no common prefix");
		}else {
			System.out.println("The common prefix is " + first.substring(0, count).trim());
		}
		
	}

}
