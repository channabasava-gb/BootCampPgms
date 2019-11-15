package Com.Day_1;

import java.util.Scanner;

public class Pgm06 {
	public static void main (String [] args)
	{
	Scanner sc=new Scanner (System.in);
	System.out.println ("Enter the year") ;
	int n=sc.nextInt ();
	if(n<=1582)
	{
		System.out.println("enter the value above 1582");
	}
	else if ((n%400==0)||(n%4==0&&n%100!=0))
	System.out.println ("it is a leap year");
	else
	System.out.println ("not a leap year");
	}

}
