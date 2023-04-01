package chapter05_ex;

public class ex05_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("Numbers from 100 to 1000 divisible by 3 and 4");
		for(int i = 100; i <= 1000; i++) {
			if(i % 3 == 0 && i % 4 == 0) {
				if(count % 10 == 0) {
					System.out.print("\n" + i + " ");
				}else {
					System.out.print(i+ " ");
				}
				count++;
			}
			
		}

	}

}
