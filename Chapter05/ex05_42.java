package chapter05_ex;
import java.util.Scanner;

public class ex05_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter commision amount: ");
		double commisionWanted = input.nextDouble();
		input.close();
		
		//double baseSalary = 5000;
		double sales = 0;
		double commision = 0;
		
		while(commision < commisionWanted) {
			
			sales++;
			
			if(sales <= 5000) {
				commision = 0.06 * sales;
			}else if(sales <= 10000){
				commision = 5000 * 0.06 + (sales - 5000) * 0.08;
			}else {
				commision = 5000 * 0.06 + 5000 * 0.08 + (sales - 10000) * 0.10;
			}
			
		}
		
		System.out.printf("To earn £%.2f from commision sales need to be £%.2f",commisionWanted,sales);

	}

}
