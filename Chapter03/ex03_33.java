package chapter03_ex;
import java.util.Scanner;

public class ex03_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight and price for packege 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.print("Enter weight and price for packege 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		input.close();
		
		double pricePerUnit1 = price1 / weight1;
		double pricePerUnit2 = price2 / weight2;
		
		if(pricePerUnit1 < pricePerUnit2) {
			System.out.print("Packege 1 has a better price.");
		}else if(pricePerUnit1 > pricePerUnit2) {
			System.out.print("Packege 2 has a better price.");
		}else {
			System.out.println("Both packeges have same price.");
		}

	}

}
/*
(Financial: compare costs)
Suppose you shop for rice in two different packages. You would like to write a program to compare the cost. 
The program prompts the user to enter the weight and price of each package and displays the one with the better price.
*/