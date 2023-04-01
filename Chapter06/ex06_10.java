package chapter06_ex;
//import java.util.Scanner;

public class ex06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print prime numbers under 10000
		System.out.println("Prime numbers under 10000 are:\n");
		printPrimeNumbers(10000);
		
		/*
		//input the limit - remove comment on import package
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your limit: ");
		int limit = input.nextInt();
		input.close();
		
		System.out.println("Prime numbers under "+ limit +" are:\n");
		printPrimeNumbers(limit);
		*/
		

	}
	
	public static void printPrimeNumbers(int limit) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0;
		int number = 2;
		
		while(number < limit) {
			if(isPrime(number)) {
				count++;
				
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0) {
					System.out.printf("%-5d\n", number);
				}else {
					System.out.printf("%-5d", number);
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

}
