package chapter05_ex;

public class ex05_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 2;
		int count = 0;
		
		System.out.println("Prime numbers between 2 and 1200");
		
		while(number <= 1200) {
			boolean isPrime = true;
			
			for(int divisor = 2; divisor <= number / 2; divisor++) {
				if(number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				if(count % 8 == 0) {
					System.out.print("\n" + number + " ");
				}else {
					System.out.print(number + " ");
				}
				count++;
			}
			number++;
		}

	}

}
