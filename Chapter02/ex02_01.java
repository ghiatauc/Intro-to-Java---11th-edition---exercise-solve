package chapter02_ex;
import java.util.Scanner;

public class ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter miles: ");
		double miles = input.nextDouble();
		input.close();
		
		double kilometers = miles * 1.6;
		
		System.out.println(miles+" miles is "+(int)(kilometers*10)/10.0+" kilometers");
		
		

	}

}
