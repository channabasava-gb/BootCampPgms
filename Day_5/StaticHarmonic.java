package Com.Day_5;

import java.util.Scanner;

public class StaticHarmonic {
	public static double harm(double n)
	{
		double result=0.0;
		double sum=0.0;
		for(int i=1;i<=n;i++)
		{
			result=1.0/i;
			System.out.println(result + " ");
			sum=sum+result;
			
		}
		System.out.println("the sum of nth harmonic is " +sum);
		return sum;
	
		
	}
	public static void sin(double radian)
	{
		double sin=Math.sin(radian);
System.out.println("the sin value is : " +sin);
	}
	public static void cos(double radian)
	{
		double cos=Math.cos(radian);
		System.out.println("the cos(x) is : "+ cos);
	}
	public static void binary(int n)
	{
		int rem=0;
		while(n>0)
		{
			 rem=n%2;
			 n=n/2;
			System.out.print( +rem);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("The Harmonic Series is :");
		harm(n);
		System.out.println("-----------------");
		System.out.println("Enter the the degree");
		int degree=sc.nextInt();
		double radian=Math.toRadians(degree);
		System.out.println("the convertion of degrre to radian is " +radian);
		sin(radian);
		System.out.println("---------");
		cos(radian);
		System.out.println("-----------");
		System.out.println("Enter the decimal number");
		int d=sc.nextInt();
		binary(d);
		sc.close();
		
	}

}
