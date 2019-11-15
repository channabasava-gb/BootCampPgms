package Com.Day_1;

import java.util.Scanner;

public class Qudratic {
	static void qud(double a,double b,double c) {
		
		double delta=(b*b-4*a*c);
		if(delta<0)
		{
			System.out.println("take one value negative imaginary");
		}
		else
		{
			double x=(-b+Math.sqrt(delta))/(2*a);
			double y=(-b-Math.sqrt(delta))/(2*a);
			System.out.println(x);
			System.out.println(y);
		}

	}
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Entre the value of a,b,c");
		double a=sc1.nextInt();
		double b=sc1.nextInt();
		double c=sc1.nextInt();
		qud(a,b,c);
		
	}
	

}
