package Com.Day_2;

import java.util.Scanner;

public class Trig {
	public static void main(String[] args) {
		/*Scanner sc1=new Scanner(System.in);
		System.out.println("generate an angel in degree");
		int degree=sc1.nextInt();
		double redians=Math.toRadians(degree);
		System.out.println("redians value is:"+redians);
		double sin=Math.sin(redians);
		System.out.println("sin value is:"+sin);
		double cos=Math.cos(redians);
		System.out.println("cos value is :"+cos);
*/
		
		
	//	 public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		 System.out.println("enter the degree");
		        double degrees = sc1.nextDouble();
		 //      System.out.println("enter the radianc");
		        double radians = Math.toRadians(degrees);

		        double s = Math.sin(radians);
		        System.out.println("sin(" + degrees + ") = " + s);

		        double c = Math.cos(radians);
		        System.out.println("cos(" + degrees + ") = " + c);

		        double t = Math.tan(radians);
		        System.out.println("tan(" + degrees + ") = " + t);
		        System.out.println(s + " / " + c + " = " + s / c);

		        double r = s*s + c*c;
		        System.out.println(s*s + " + " + c*c + " = " + r);
		    }
		
	}
	

