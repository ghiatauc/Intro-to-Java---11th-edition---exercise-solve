package chapter05_ex;

public class ex05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Inches   Centimeters");
		
		for(int i = 1 ; i <= 10; i++) {
			int inch = i;
			double cm = inch * 2.54;
			
			System.out.printf("\n%-4d     %-6.2f",inch,cm);
		}

	}

}
