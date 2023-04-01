package chapter06_ex;

public class ex06_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sales Amount      Commision");
		System.out.println("---------------------------");
		for(int i = 10000; i <= 100000; i += 5000) {
			System.out.printf("%-6d            %7.1f\n", i, computeCommision(i));
		}

	}
	
	public static double computeCommision(double saleAmount) {
		double commision = 0;
		
		if(saleAmount <= 5000) {
			commision = 0.06 * saleAmount;
		}else if(saleAmount <= 10000){
			commision = 5000 * 0.06 + (saleAmount - 5000) * 0.08;
		}else {
			commision = 5000 * 0.06 + 5000 * 0.08 + (saleAmount - 10000) * 0.10;
		}
			
		return commision;
	}

}
