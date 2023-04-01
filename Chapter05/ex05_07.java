package chapter05_ex;

public class ex05_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 10000;
		double increaseRate = 0.06;
		
		for(int i = 0 ; i < 10; i++) {
			tuition = tuition * (1 + increaseRate);
		}
		System.out.printf("Tuition will be %.2f in ten years.\n",tuition);
		
		double totalTuition = 0;
		for(int i = 0; i < 4; i++) {
			tuition = tuition * (1 + increaseRate);
			totalTuition += tuition;
		}
		
		System.out.printf("Total cost of four years' worth of tuition after the tenth year is £%.2f.",totalTuition);

	}

}
