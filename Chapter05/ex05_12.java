package chapter05_ex;

public class ex05_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		int n3 = 1;
		
		while(n3 < 12000) {
			n++;
			n3 = (int)Math.pow(n, 3); 
		}
		
		System.out.println("The smallest n that n^3 is less than 12000 is " + n);

	}

}
