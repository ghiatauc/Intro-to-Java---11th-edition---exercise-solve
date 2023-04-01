package chapter05_ex;

public class ex05_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.print("ASCII table");
		
		for(char i = '!'; i <= '~'; i++) {
			if(count % 10 == 0) {
				System.out.print("\n" + i + " ");
			}else {
				System.out.print(i + " ");
			}
			count++;
		}

	}

}
