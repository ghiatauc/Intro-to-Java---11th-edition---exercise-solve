package chapter05_ex;

public class ex05_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("Leap years between 2014 and 2114");
		for(int i = 2014; i <= 2114; i++) {
			boolean isLeapYear = (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
			
			if(isLeapYear) {
				count++;
				
				if(count % 10 == 0) {
					System.out.println(i);
				}else {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println("\nNumber of leap years: " + count);

	}

}
