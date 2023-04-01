package chapter05_ex;

public class ex05_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int heads = 0;
		int tails = 0;
		
		for(int i = 0; i < 2000000; i++) {
			int coin = (int)(Math.random() * 2);
			
			if(coin == 0) {
				heads++;
			}else {
				tails++;
			}
		}
		
		System.out.print("Heads: " + heads + "\nTails: " + tails);

	}

}
