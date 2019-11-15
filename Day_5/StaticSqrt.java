package Com.Day_5;

import java.util.Scanner;

public class StaticSqrt {
	public static double squrt1(double c)
	{
		double sqt=Math.sqrt(c);
		System.out.println("the Square root is "+ c);
	return sqt;
	}
	public static double squrt1(double c,double epislon)
	{
		epislon=1e-15;
		double t=c;
		while(Math.abs(t-c/t) > epislon*t)
		{
			t=(c/t+t)/2.0;
		}
		System.out.println("the Square root of newton epislon" +t);
		return t;
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value to find sqyare");
		double c=sc.nextDouble();
		squrt1(c);
		System.out.println("-------------------------------------");
		double  epislon=1e-15;
		squrt1(c,epislon);
	}


}
