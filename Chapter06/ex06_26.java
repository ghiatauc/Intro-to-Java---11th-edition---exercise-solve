package chapter06_ex;

public class ex06_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int number = 2;
		
		System.out.println("First 120 palindromic prime numbers are");
		
		while(count < 120) {
			if(isPrime(number) && isPalindromic(number)) {
				count++;
				
				if(count % 10 == 0) {
					System.out.println(number);
				}else {
					System.out.print(number + " ");
				}
			}
			
			number++;
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
	
	public static boolean isPalindromic(int number) {
		
		if(number == reverse(number)) {
			return true;
		}
		
		return false;
	}
	
	public static int reverse(int number) {
		String num = number + "";
		String reverse = "";
		
		for(int i = 0; i < num.length(); i++) {
			reverse = num.charAt(i) + reverse;
		}
		
		return Integer.parseInt(reverse);
	}

}
