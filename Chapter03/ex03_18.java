package chapter03_ex;
import java.util.Scanner;

public class ex03_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the weight of the packege: ");
		double weight = input.nextDouble();
		input.close();
		
		if(weight > 20)
			System.out.println("The packege cannot be shipped!");
		else if(weight > 10)
			System.out.println("The cost of shipping is 10.5");
		else if(weight > 4)
			System.out.println("The cost of shipping is 7.5");
		else if(weight > 2)
			System.out.println("The cost of shipping is 4.5");
		else if(weight > 0)
			System.out.println("The cost of shipping is 2.5");
		else
			System.out.println("Wrong input");

	}

}
/*
(Cost of shipping)
A shipping company uses the following function to calculate the cost (in dollars) of shipping 
based on the weight of the package (in pounds). c(w) is 
2.5 if 0 < w <=2
4.5 if 2 < w <=4
7.5 if 4 < w <=10
10.5 if 10 < w <= 20
Write a program that prompts the user to enter the weight of the package and 
display the shipping cost. If the weight is greater than 20, display a message “the 
package cannot be shipped.” 
*/