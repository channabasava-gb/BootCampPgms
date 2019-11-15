package Com.Day_5;

import java.util.Scanner;

public class StaticFutureValue {
	static void doll(long c,double r,int t)
	{
		double fut=c*(Math.pow((1+r), t));
		System.out.println("the future value is :" +fut);
	}
    public static void main(String[] args)
    {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the money/dollar to invest");
	    long c=sc.nextLong();
	    System.out.println("Enter the rate of Intrest");
	    double r=sc.nextDouble();
	    System.out.println("Enter the time of Period");
	    int t=sc.nextInt();
	    doll(c,r,t);
	    sc.close();
     }

}
