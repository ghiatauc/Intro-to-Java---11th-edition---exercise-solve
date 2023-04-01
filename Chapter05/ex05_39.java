package chapter05_ex;

public class ex05_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double baseSalary = 5000.0;
		double commision = 0;
		double sales = 0;
		
		do {
			sales++;
			
			if(sales <= 5000) {
				commision = 0.06 * sales;
			}else if(sales <= 10000){
				commision = 5000 * 0.06 + (sales - 5000) * 0.08;
			}else {
				commision = 5000 * 0.06 + 5000 * 0.08 + (sales - 10000) * 0.10;
			}
			
		}while(baseSalary + commision <= 30000);
		
		System.out.printf("The minimum sales you have to generate to earn £30000 per year: £%.2f",sales);

	}

}
