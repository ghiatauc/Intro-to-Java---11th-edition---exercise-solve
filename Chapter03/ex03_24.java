package chapter03_ex;

public class ex03_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int card = (int) (Math.random() * 53);
		
		System.out.print("The card you picked is ");
		
		int cardRank = card % 13;
		
		switch(cardRank) {
		case 0: System.out.print("Ace "); break;
		case 1: System.out.print("2 "); break;
		case 2: System.out.print("3 "); break;
		case 3: System.out.print("4 "); break;
		case 4: System.out.print("5 "); break;
		case 5: System.out.print("6 "); break;
		case 6: System.out.print("7 "); break;
		case 7: System.out.print("8 "); break;
		case 8: System.out.print("9 "); break;
		case 9: System.out.print("10 "); break;
		case 10: System.out.print("Jack "); break;
		case 11: System.out.print("Queen "); break;
		case 12: System.out.print("King "); break;
		}
		
		int cardSuit = card / 13;
		
		switch(cardSuit) {
		case 0: System.out.print("of Clubs"); break;
		case 1: System.out.print("of Diamonds"); break;
		case 2: System.out.print("of Hearts"); break;
		case 3: System.out.print("of Spades"); break;
		}
		

	}

}

/*
(Game: pick a card)
Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank 
(Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
*/