package chapter05_ex;

public class ex05_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//use for loop
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf(j + "*" + i + "=%2d  ",j*i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//use do-while loop
		int a = 1;
		do {
			int b = 1;
			
			do {
				System.out.printf(b + "*" + a + "=%2d  ", b*a);
				b++;
			}while(b <= 9);
			
			System.out.println();
			a++;
		}while(a <= 9);
		
		System.out.println();
		
		//use while loop
		a = 1;
		while(a <= 9) {
			int b = 1;
			
			while(b <= 9) {
				System.out.printf(b + "*" + a + "=%2d  ", b*a);
				b++;
			}
			
			System.out.println();
			a++;
		}

	}

}
