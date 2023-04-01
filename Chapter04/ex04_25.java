package chapter04_ex;

public class ex04_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String plate = "";
		
		char ch1 = (char)('A' + Math.random() * ('Z' - 'A' + 1));
		char ch2 = (char)('A' + Math.random() * ('Z' - 'A' + 1));
		char ch3 = (char)('A' + Math.random() * ('Z' - 'A' + 1));
		
		char ch4 = (char)('0' + Math.random() * ('9' - '0' + 1));
		char ch5 = (char)('0' + Math.random() * ('9' - '0' + 1));
		char ch6 = (char)('0' + Math.random() * ('9' - '0' + 1));
		char ch7 = (char)('0' + Math.random() * ('9' - '0' + 1));
		
		plate += ch1 + "" + ch2 + "" + ch3 + "-" + ch4 + "" + ch5 + "" + ch6 + "" + ch7;
		
		System.out.println("Random place registration: " + plate);

	}

}
