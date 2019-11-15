package Com.Day_5;

import java.util.Scanner;

public class StaticLong {

	public static long fact(int n)
	{
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product=product*i;
		//System.out.println(product);
	System.out.println("the fact is "+ n + " * " + i + " is " +product);
		}
		return product;
		}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fact number");
		int n=sc.nextInt();
		fact(n);
	}


}
