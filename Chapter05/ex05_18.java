package chapter05_ex;

public class ex05_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pattern A");
		System.out.println();
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Pattern B");
		System.out.println();
		
		for(int i = 6; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Pattern C");
		System.out.println();
		
		for(int i = 0; i < 6; i++) {
			for(int j = 1; j < 6 - i; j++) {
				System.out.print("  ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("Pattern D");
		System.out.println();
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6 - i; j++) {
				System.out.print("* ");
			}
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
