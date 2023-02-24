package chapter01_ex;

public class exercise_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi;
		
		pi = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println("Pi is "+pi);
		
		pi = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));
		System.out.println("Pi is "+pi);
	}

}
/*
(Approximate pi)
pi can be computed using the following formula: pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + .....)
Write a program that displays the result of 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
and 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13). Use 1.0 instead of 1 in your program.
*/
