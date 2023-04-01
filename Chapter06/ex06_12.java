package chapter06_ex;

public class ex06_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Numbers between 1 and 100, 10 per line:");
		printNumbers(1, 100, 10);
	}
	
	public static void printNumbers(int num1, int num2, int numberPerLine) {
		int count = 0;
		for(int i = num1; i <= num2; i++) {
			if((count+1) % 10 == 0) {
				System.out.println(i+ " ");
			}else {
				System.out.print(i+ " ");
			}
			count++;
		}
		
	}

}
