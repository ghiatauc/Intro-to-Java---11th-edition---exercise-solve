package chapter06_ex;

public class ex06_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countWin = 0;
		for(int i = 0; i < 15000; i++) {
			if(crapsGameWin()) {
				countWin++;
			}
		}
		
		System.out.println("Wining game number: " + countWin);

	}
	
	public static boolean crapsGameWin() {
		int game = rollDice();
		if(game == 2 || game == 3 || game == 12) {
			return false;
		}else if(game == 7 || game == 11) {
			return true;
		}else {
			int point = game;
			
			do {
				game = rollDice();
			}while(game != 7 && game != point);
			
			if(game == 7) {
				return false;
			}
			if(game == point) {
				return true;
			}
		}
		
		return false;
	}
	
	public static int rollDice() {
		int dice1 = (int)(1 + Math.random() * 6);
		int dice2 = (int)(1 + Math.random() * 6);
		
		return dice1 + dice2;
		
	}

}
