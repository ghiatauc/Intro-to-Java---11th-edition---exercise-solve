package chapter05_ex;

public class ex05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Ping   Square meter   |   Square meter     Ping\n");
		
		for(int i = 10, j = 30; i <= 80; i += 5, j += 5) {
			int ping = i;
			double squareMeter = ping * 3.305;
			
			int squareMeter1 = j;
			double ping1 = squareMeter1 / 3.305;
			System.out.printf("%-4d   %12.3f   |   %-12d   %6.3f\n",ping, squareMeter, squareMeter1, ping1);
		}

	}

}
