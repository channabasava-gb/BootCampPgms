package Com.Day_1;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the x value");
		int x=sc1.nextInt();
		System.out.println("Enter the y value");
		int y=sc1.nextInt();
		
		double distance =(Math.sqrt(x*x+y*y));
		System.out.println(distance);
		
	}

}
