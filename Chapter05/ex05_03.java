package chapter05_ex;

public class ex05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Celsius  Fahrenheit");
		
		for(int i = 0 ; i <= 100; i += 2) {
			int celsius = i;
			double fahrenheit = (celsius * 9.0/5) + 32;
			
			System.out.printf("\n%-4d %14.1f", celsius, fahrenheit);
		}

	}

}
