package chapter06_ex;

public class ex06_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p          2^p - 1\n------------------");
		
		for(int i = 2; i <= 31; i++) {
			int num = (int)(Math.pow(2, i) - 1);
			
			if(isPrime(num)) {
				System.out.printf("%-2d         %-10d\n", i, num);
			}
			
		}

	}
	
	public static boolean isPrime(int number) {
		for(int divisor = 2; divisor <= number / 2; divisor++) {
			if(number % divisor == 0) {
				return false;
			}
		}
		
		return true;
	}

}
