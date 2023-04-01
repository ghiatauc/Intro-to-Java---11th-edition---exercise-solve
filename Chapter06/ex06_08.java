package chapter06_ex;

public class ex06_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%5s     %10s     |     %10s     %5s\n","Miles","Kilometers", "Kilometers", "Miles");
		for(int i = 1, j = 20; i <= 10; i++, j += 5) {
			System.out.printf("%-5d     %-10.3f     |     %-10d     %-5.3f\n", i, mileToKilometer(i), j, kilometerToMiles(j));
		}

	}
	
	public static double mileToKilometer(double mile) {
		return mile * 1.609;
	}
	
	public static double kilometerToMiles(double kilometer) {
		return kilometer / 1.609;
	}

}
