package chapter02_ex;
import java.util.Scanner;

public class ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		double gratuityAmount = subtotal * gratuityRate / 100.0;
		double total = gratuityAmount + subtotal;
		
		System.out.println("The gratuity is £"+(int)(gratuityAmount * 100) / 100.0+" and the total is £"+(int)(total * 100) / 100.0);

	}

}
