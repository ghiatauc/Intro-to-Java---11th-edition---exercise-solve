package chapter02_ex;
import java.util.Scanner;

public class ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		input.close();
		
		double gratuityAmount = subtotal * gratuityRate / 100.0;
		double total = gratuityAmount + subtotal;
		
		System.out.println("The gratuity is £"+(int)(gratuityAmount * 100) / 100.0+" and the total is £"+(int)(total * 100) / 100.0);
	}

}
/*
(Financial application: calculate tips) 
Write a program that reads the subtotal and the gratuity rate and then computes 
the gratuity and total. For example, if the user enters 10 for subtotal and 12% 
for gratuity rate, the program displays $1.2 as gratuity and $11.2 as total.
*/