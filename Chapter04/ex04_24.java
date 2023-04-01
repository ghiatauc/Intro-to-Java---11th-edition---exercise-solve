package chapter04_ex;
import java.util.Scanner;

public class ex04_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first country: ");
		String country1 = input.nextLine();
		System.out.print("Enter the second country: ");
		String country2 = input.nextLine();
		System.out.print("Enter the third country: ");
		String country3 = input.nextLine();
		input.close();
		
		//test values
		/*
		String country1 = "Germany";
		String country2 = "France";
		String country3 = "Switzerland";
		*/
		
		if(country1.compareToIgnoreCase(country2) < 0) {
			String temp = country1;
			country1 = country2;
			country2 = temp;
		}
		
		if(country2.compareToIgnoreCase(country3) < 0) {
			String temp = country2;
			country2 = country3;
			country3 = temp;
		}
		
		if(country1.compareToIgnoreCase(country2) < 0) {
			String temp = country1;
			country1 = country2;
			country2 = temp;
		}
		
		System.out.println("The three countries in descending order are " +country1 + " " + country2 + " " + country3);
		

	}

}
