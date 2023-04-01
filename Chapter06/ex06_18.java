package chapter06_ex;
import java.util.Scanner;

public class ex06_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a password: ");
		String password = input.next();
		input.close();
		
		
		//String password = "Radauti1301"; //test value - valid password
		//String password = "Baba12";  //test value - invalid password / short length
		//String password = "Babababa12@" //test value - invalid password / special character
		//String password = "Babababa12" //test value - invalid password / less than 3 digits
		
		System.out.println(checkPassword(password) ? "Valid Password" : "Invalid Password");

	}
	
	public static boolean checkPassword(String password) {
		if(password.length() < 10) {
			return false;
		}
		
		for(int i = 0; i < password.length(); i++) {
			if(!Character.isLetterOrDigit(password.charAt(i))){
				return false;
			}
			
		}
		
		int count = 0;
		for(int i = 0; i < password.length(); i++) {
			if(Character.isDigit(password.charAt(i))){
				count++;
			}
		}
		if(count < 3) {
			return false;
		}
		
		return true;
	}

}
