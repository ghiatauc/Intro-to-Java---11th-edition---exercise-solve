package chapter05_ex;

public class ex05_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 7; i++) {
			
			for(int j = 0; j < 7 - i; j++) {
				System.out.printf("%5s","");
			}
			
			for(int k = 0; k <= i; k++) {
				System.out.printf("%5d",(int)Math.pow(3, k));
			}
		
			for(int n = i - 1; n >= 0; n--) {
				System.out.printf("%5d",(int)Math.pow(3, n));
			}
			
			for(int m = 7 - i; m > 0; m--) {
				System.out.printf("%5s", "");
			}
			
			System.out.println();
		}

	}

}
