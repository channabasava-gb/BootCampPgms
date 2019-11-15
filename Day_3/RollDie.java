package Com.Day_3;

import java.util.Scanner;

public class RollDie {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ënter the number");
		double n=sc.nextInt();
		double max=Math.random()*6+1;
		System.out.println("max number is:"+max);
		for(int i=1;i<n;i++)
		{
			double m=Math.random()*6+1;
			System.out.println("max number is:"+max);
			max=Math.max(max, m);
		}
		System.out.println("max number is:"+max);
	}

}
