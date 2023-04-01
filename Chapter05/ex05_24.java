package chapter05_ex;

public class ex05_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 1; i <= 97; i += 2) {
			double a = i * 1.0;
			double b = i + 2.0;
			
			sum += a / b;
			
		}
		
		System.out.println("Sum for series 1/3 + 3/5 +...+ 97/99 is " + sum);

	}

}
