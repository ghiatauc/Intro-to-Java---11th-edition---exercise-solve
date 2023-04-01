package chapter05_ex;

public class ex05_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Celsius   Fahrenheit   |   Fahrenheit   Celsius\n");
		
		for(int i = 0, j = 20; i <= 100; i = i + 2, j = j + 5) {
			int celsius = i;
			double fahrenheit = celsius * (9.0 / 5) + 32;
			
			int fahrenheit1 = j;
			double celsius1 = (fahrenheit1 - 32) / 1.80;
			
			System.out.printf("%-7d   %10.3f   |   %-10d   %7.3f\n",celsius, fahrenheit, fahrenheit1, celsius1);
			
		}

	}

}
