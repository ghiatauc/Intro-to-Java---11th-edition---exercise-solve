package chapter06_ex;

public class ex06_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int number = 2;
		
		System.out.println("First 120 emirp numbers are");
		
		while(count < 120) {
			if(isPrime(number) && isPrime(reverse(number)) && number != reverse(number)) {
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
	
	public static int reverse(int number) {
		String num = number + "";
		String reverse = "";
		
		for(int i = 0; i < num.length(); i++) {
			reverse = num.charAt(i) + reverse;
		}
		
		return Integer.parseInt(reverse);
	}

}
