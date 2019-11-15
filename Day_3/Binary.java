package Com.Day_3;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the binary number");
		int n=sc1.nextInt();
		double i=0;
		int sum=0;
		while(n>0)
		{
			int m=n%10;
			sum=(int)(sum+(m*Math.pow(2, i)));
			n=n/10;
			i++;
		}
		System.out.println(sum);
		
		
	}
	
	

}
