package chapter06_ex;

public class ex06_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crapsGame();
		
	}
	
	public static void crapsGame() {
		int game = rollDice();
		if(game == 2 || game == 3 || game == 12) {
			System.out.println("You lose");
		}else if(game == 7 || game == 11) {
			System.out.println("You win");
		}else {
			int point = game;
			System.out.println("point is " + point);
			
			do {
				game = rollDice();
			}while(game != 7 && game != point);
			
			if(game == 7) {
				System.out.println("You lose");
			}
			if(game == point) {
				System.out.println("You win");
			}
		}
	}
	
	public static int rollDice() {
		int dice1 = (int)(1 + Math.random() * 6);
		int dice2 = (int)(1 + Math.random() * 6);
		
		System.out.println("You rolled " + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
		
		return dice1 + dice2;
		
	}

}
