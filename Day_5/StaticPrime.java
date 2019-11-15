package Com.Day_5;

import java.util.Scanner;

public class StaticPrime {
	public static void isPrime(int n)
	{
		int i;
		for( i=2;i<n;i++)
		{
			if(n%i==0)
			{
				System.out.println("false");
				break;
			}
		}
			if(n==i)
			{
				System.out.println("true");
			}
		
	
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		isPrime(n);
		
	}


	}



