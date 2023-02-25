package chapter03_ex;
import java.util.Scanner;

public class ex03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers: ");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		input.close();
		
		if(n1 > n2) {
			int temp1 = n1;
			n1 = n2;
			n2 = temp1;
		}
		
		if(n2 > n3) {
			int temp2 = n2;
			n2 = n3;
			n3 = temp2;
		}
		
		if(n1 > n2) {
			int temp3 = n1;
			n1 = n2;
			n2 = temp3;
		}
		
		System.out.println(n1+" "+n2+" "+n3);

	}

}
/*
Write a program that prompts the user to enter three integers and 
display the integers in non-decreasing order. 
*/
