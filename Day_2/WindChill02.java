package Com.Day_2;

import java.util.Scanner;

public class WindChill02 {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the temparatur value");
		double t=sc1.nextDouble();
		System.out.println("Enter the valocity value");
		double v=sc1.nextDouble();
		double w=0;
		if(t>50||v>120||v<3)
		{
			System.out.println("out of the rang");
			return;
		}
		else
		{
			w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
		}
		System.out.println("the WindChill is"+w);
		
		
		
		
	}
}


