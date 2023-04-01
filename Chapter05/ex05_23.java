package chapter05_ex;

public class ex05_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50000;
		double sumLeftToRight = 0;
		double sumRightToLeft = 0;
		
		for(int i = 1; i<= n; i++) {
			sumLeftToRight += (1.0 / i);
		}
		
		for(int j = 50000; j > 0; j--) {
			sumRightToLeft += (1.0 / j);
		}
		
		double difference = sumRightToLeft - sumLeftToRight;
		
		
		
		System.out.println("Sum from left to right " + sumLeftToRight);
		System.out.println("Sum from right to left " + sumRightToLeft);
		System.out.println("Difference between sum " + difference);

	}

}
