package chapter06_ex;

public class ex06_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime number pairs under 1200");
		
		for(int i = 2; i <= 1198; i++) {
			if(isPrime(i) && isPrime(i + 2)) {
				System.out.println("("+ i + ", " + (i + 2) + ")");
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
