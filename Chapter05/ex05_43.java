package chapter05_ex;

public class ex05_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		for(int i = 1; i <= 7; i++) {
			for(int k = i + 1; k <= 7; k++) {
				System.out.println(i + " " + k);
				count++;
			}
		}
		System.out.println("The total number of all combination is " + count);

	}

}
