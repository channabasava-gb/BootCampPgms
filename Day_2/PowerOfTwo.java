package Com.Day_2;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Poweof number");
		int n=sc.nextInt();
//		int i=0;
		int power=1;

		for (int i=1;i<=n;i++)
		{
			
		    power=power*2;
//		    i=i+1;
		    System.out.println("2 ^ " + i + " : " +power);

		}
		sc.close();
	}


}
