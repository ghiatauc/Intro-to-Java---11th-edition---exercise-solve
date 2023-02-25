package chapter03_ex;

public class ex03_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isPositive = Math.random() > 0.5;
		int x =(int) (Math.random() * 25);
		x = (isPositive && x != 0) ? x : -x;
		
		isPositive = Math.random() > 0.5;
		int y = (int) (Math.random() * 75);
		y = (isPositive && y != 0) ? y : -y;
		
		
		System.out.println("Point coordinate x: "+x+" and y: "+y);
		
	}

}
/*
(Random point)
Write a program that displays a random coordinate in a rectangle. 
The rectangle is centred at (0, 0) with width 50 and height 150. 
*/