package chapter05_ex;

public class ex05_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int  number = 6;  //test value perfect number
		//int number = 28;  //test value perfect number
		//int number = 99;  //test value not perfect number
		int number = 1;
		
		System.out.print("Perfect numbers under 10000 are: ");
		
		while(number <= 10000) {
			int sum = 0;
			
			for(int i = 1; i <= number / 2; i++) {
				if(number % i == 0) {
					sum += i;
				}
			}
			
			if(number == sum) {
				System.out.print(number + " ");
			}
			
			number++;
		}
		
	}

}
