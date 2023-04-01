package chapter04_ex;

public class ex04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double radius = 40.0;
		
		//first point coordinates
		double alfa = Math.random() * 2 * Math.PI;
		double x1 = radius * Math.cos(alfa);
		double y1 = radius * Math.sin(alfa);
		
		//second point coordinates
		alfa = Math.random() * 2 * Math.PI;
		double x2 = radius * Math.cos(alfa);
		double y2 = radius * Math.sin(alfa);
		
		//third point coordinates
		alfa = Math.random() * 2 * Math.PI;
		double x3 = radius * Math.cos(alfa);
		double y3 = radius * Math.sin(alfa);
		
		//compute sides of triangle
		double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		//compute 3 angles
		double A = Math.toDegrees(Math.acos((Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2)) / (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((Math.pow(b, 2) - Math.pow(a, 2) - Math.pow(c, 2)) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((Math.pow(c, 2) - Math.pow(b, 2) - Math.pow(a, 2)) / (-2 * a * b)));
		
		//display results
		System.out.println("First point coordinates x1: "+x1+" and y1: "+y1);
		System.out.println("First point coordinates x2: "+x2+" and y2: "+y2);
		System.out.println("First point coordinates x3: "+x3+" and y3: "+y3);
		System.out.printf("The three angles are %.2f, %.2f and %.2f",A,B,C);

	}

}
