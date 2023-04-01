package chapter04_ex;
import java.util.Scanner;

public class ex04_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the ASCII code (0-127): ");
		int asciiCode = input.nextInt();
		input.close();
		
		if(asciiCode < 0 && asciiCode > 127) {
			System.out.println("Wrong input!");
			System.exit(1);
		}
		
		char ascii = (char)asciiCode;
		
		System.out.println("The ASCII character for "+asciiCode+" is "+ascii);
		
	}

}
