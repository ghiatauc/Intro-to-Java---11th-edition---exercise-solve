package chapter04_ex;
import java.util.Scanner;

public class ex04_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String month = input.next();
		input.close();
		
		//int year = 2024;
		//String month = "FeB";
		
		if(month.length() != 3 || Character.isLowerCase(month.charAt(0))) {
			System.out.println(month + " is not a correct month name");
			System.exit(1);
		}
		
		boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
		
		if(month.equalsIgnoreCase("Jan") || month.equalsIgnoreCase("Mar") || month.equalsIgnoreCase("May") || 
				month.equalsIgnoreCase("Jul") || month.equalsIgnoreCase("Aug") || month.equalsIgnoreCase("Oct") || 
				month.equalsIgnoreCase("Dec")) {
			//if second or third char is upper case format as lower case
			char month_Letter1 = month.charAt(0);
			char month_Letter2 = Character.toLowerCase(month.charAt(1));
			char month_Letter3 = Character.toLowerCase(month.charAt(2));
			//right format of month
			month = month_Letter1 + "" + month_Letter2 + month_Letter3;
			
			System.out.println(month + " " + year + " has 31 days");
			
		} else if(month.equalsIgnoreCase("Apr") || month.equalsIgnoreCase("Jun") || month.equalsIgnoreCase("Sep") || 
				month.equalsIgnoreCase("Nov")) {
			//if second or third char is upper case format as lower case
			char month_Letter1 = month.charAt(0);
			char month_Letter2 = Character.toLowerCase(month.charAt(1));
			char month_Letter3 = Character.toLowerCase(month.charAt(2));
			//right format of month
			month = month_Letter1 + "" + month_Letter2 + month_Letter3;
			
			System.out.println(month + " " + year + " has 30 days");
			
		} else if (month.equalsIgnoreCase("Feb")){
			//if second or third char is upper case format as lower case
			char month_Letter1 = month.charAt(0);
			char month_Letter2 = Character.toLowerCase(month.charAt(1));
			char month_Letter3 = Character.toLowerCase(month.charAt(2));
			//right format of month
			month = month_Letter1 + "" + month_Letter2 + month_Letter3;
			
			if(isLeap) {
				System.out.println(month + " " + year + " has 29 days");
			}else {
				System.out.println(month + " " + year + " has 28 days");
			}
		} else {
			System.out.println(month + " is not a correct month name");
			System.exit(1);
		}
		
	}

}
