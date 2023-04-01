package chapter05_ex;

public class ex05_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10000;
		
		while(count <= 100000) {
			double e = 1;
			double item = 1;
			
			for(int i = 2; i < count; i++) {
				e += item;
				item /= i;
			}
			
			System.out.println("for i = " + count + " e is " + e);
			count += 10000;
			
		}

	}

}
