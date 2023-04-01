package chapter05_ex;

public class ex05_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		int n2 = 1;
		
		while(n2 < 12000) {
			n++;
			n2 = (int)(Math.pow(n, 2));
		}
		
		System.out.println("The largest number that n^2 < 12000 is " + (n - 1));
		System.out.println((n - 1) + "^2 is " + (int)Math.pow(n-1, 2));

	}

}
