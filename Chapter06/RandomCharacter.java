package chapter06_ex;

public class RandomCharacter {
	
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}
	
	//generate lower chase character
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}
	
	//generate upper case character
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}
	
	//generate digit character
	public static char getRandomDigitCharacter() {
		return getRandomCharacter('0', '9');
	}
	
	//generate random character
	public static char getRandomCharacter() {
		return getRandomCharacter('\u0000', '\uFFFF');
	}


}

