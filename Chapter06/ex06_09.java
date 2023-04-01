package chapter06_ex;

public class ex06_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%8s    %6s     |     %6s      %8s\n", "Kilogram", "Pound", "Pound", "Kilogram");
		System.out.println("-------------------------------------------------");
		for(int i = 1, j = 20; i <= 199; i+=2, j += 5) {
			System.out.printf("%-8d     %-6.1f     |     %-6d     %-6.2f\n", i, poundToKilogram(i), j, kilogramToPound(j));
		}
		

	}
	
	public static double poundToKilogram(double pound) {
		return 2.204 * pound;
	}
	
	public static double kilogramToPound(double kilogram) {
		return 0.453 * kilogram;
	}

}
