package chapter06_ex;

public class ex06_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%1s     %6s\n", "i", "m(i)");
		System.out.println("--------------");
		for(int i = 1; i <= 1000; i += 100) {
			System.out.printf("%-3d     %6.4f\n", i, calculatePI(i));
		}
	}
	
	public static double calculatePI(int limit) {
		double series = 0;
		
		for(int i = 1; i <= limit; i++) {
			series += ((Math.pow(-1, i + 1)) / (2.0 * i - 1.0));
		}
		
		
		return series * 4.0;
	}

}
