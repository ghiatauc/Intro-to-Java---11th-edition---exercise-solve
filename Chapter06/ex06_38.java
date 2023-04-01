package chapter06_ex;

public class ex06_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0; i < 200; i++) {
			count++;
			if(count % 10 == 0) {
				System.out.println(RandomCharacter.getRandomUpperCaseLetter());
			}else {
				System.out.print(RandomCharacter.getRandomUpperCaseLetter() + " ");
			}
		}
		System.out.println();
		count = 0;
		
		for(int i = 0; i < 200; i++) {
			count++;
			if(count % 10 == 0) {
				System.out.println(RandomCharacter.getRandomDigitCharacter());
			}else {
				System.out.print(RandomCharacter.getRandomDigitCharacter() + " ");
			}
		}
		

	}

}
