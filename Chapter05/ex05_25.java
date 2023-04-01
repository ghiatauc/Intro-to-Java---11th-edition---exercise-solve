package chapter05_ex;

public class ex05_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10000;
		
		while(n <= 100000) {
			double sum = 0;
			
			for(int i = 1 ; i <= n; i++) {
				sum += (Math.pow(-1, i+1) / (2.0 * i - 1));
			}
			
			sum = 4.0 * sum;
			
			System.out.println("PI for n = " + n + " is " + sum);
			
			n += 10000;
			
		}

	}

}
