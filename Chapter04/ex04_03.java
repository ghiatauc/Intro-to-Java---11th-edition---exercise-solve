package chapter04_ex;

public class ex04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//de verificat
		final double RADIUS = 6371.01;
		//city coordinates
		double atlantaX = 33.7489954;
		double atlantaY = -84.3879824;
		
		double charlotteX = 35.2270869;
		double charlotteY = -80.8431267;
		
		double savannahX = 32.0835407;
		double savannahY = -81.0998342;
		
		double orlandoX = 28.5383355;
		double orlandoY = -81.3792365;
		
		/*
		//left triangle atlanta-charlotte-orlando
		
		double atlanta_charlotte = RADIUS * Math.acos(Math.sin(Math.toRadians(atlantaX)) * Math.sin(Math.toRadians(charlotteX)) + 
				Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(atlantaY - charlotteY)));
		
		double atlanta_orlando = RADIUS * Math.acos(Math.sin(Math.toRadians(atlantaX)) * Math.sin(Math.toRadians(orlandoX)) + 
				Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(atlantaY - orlandoY)));
		
		double charlotte_orlando = RADIUS * Math.acos(Math.sin(Math.toRadians(charlotteX)) * Math.sin(Math.toRadians(orlandoX)) + 
				Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(charlotteY - orlandoY)));
		
		double s1 = (atlanta_charlotte + atlanta_orlando + charlotte_orlando) / 2.0; //half of triangle perimeter
		
		double area1 = Math.sqrt(s1 * (s1 - atlanta_charlotte) * (s1 - atlanta_orlando) * (s1 - charlotte_orlando)); //area of left triangle
		
		//right triangle savannah-orlando-charlotte
		
		double savannah_charlotte = RADIUS * Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(charlotteX)) + 
				Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(savannahY - charlotteY)));
		
		double savannah_orlando = RADIUS * Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(orlandoX)) + 
				Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(savannahY - orlandoY)));
		
		double s2 = (savannah_charlotte + savannah_orlando + charlotte_orlando) / 2.0; //half of triangle perimeter
		
		double area2 = Math.sqrt(s1 * (s1 - savannah_charlotte) * (s1 - savannah_orlando) * (s1 - charlotte_orlando)); //area of right triangle
		
		double area = area1 + area2;
		
		System.out.printf("The area between Atlanta-Charlotte-Savannah-Orlando is %.3f km2", area);
		*/
		
		double area1 = (atlantaX * (charlotteY -orlandoY) + charlotteX * (orlandoY - atlantaY) + orlandoX * (atlantaY - charlotteY)) / 2.0;
		double area2 = (savannahX * (charlotteY -orlandoY) + charlotteX * (orlandoY - savannahY) + orlandoX * (savannahY - charlotteY)) / 2.0;
		
		double area = area1 + area2;
		System.out.printf("The area between Atlanta-Charlotte-Savannah-Orlando is %.3f km2", area);

	}

}
