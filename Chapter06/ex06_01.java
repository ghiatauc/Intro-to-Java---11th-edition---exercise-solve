package chapter06_ex;

public class ex06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER_PER_LINE = 10;
		
		
		String title = "First 100 pentagonal numbers are";
		for(int i = 0; i < 19; i++) {
			System.out.print(" ");
		}
		System.out.print(title + "\n");
		
		
		for(int i = 1; i <= 100; i++) {
			if(i % NUMBER_PER_LINE == 0) {
				System.out.printf("%7d\n", getPentagonalNumber(i));
			}else {
				System.out.printf("%7d", getPentagonalNumber(i));
			}
		}

	}
	
	public static int getPentagonalNumber(int n) {
		
		return n * (3 * n - 1) / 2;
		
	}

}
