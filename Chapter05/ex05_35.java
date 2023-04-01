package chapter05_ex;

public class ex05_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		
		for(int i = 1; i < 1000; i++) {
			double k = 1.00 / (Math.sqrt(i) + Math.sqrt(i + 1));
			sum += k;
		}
		
		System.out.println("Sum is " + sum);

	}

}
