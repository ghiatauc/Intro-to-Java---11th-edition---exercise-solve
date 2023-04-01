package chapter06_ex;

public class ex06_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%1s      %4s\n", "i", "m(i)");
		System.out.println("-------------");
		for(int i = 1; i <= 20; i++) {
			System.out.printf("%-2d     %-7.4f\n", i, series(i));
		}

	}
	
	public static double series(int limit) {
		double m_i = 0;
		
		for(int i = 1; i <= limit; i++) {
			m_i += ((i * 1.0) / (i + 2.0));
		}
		
		return m_i;
	}

}
