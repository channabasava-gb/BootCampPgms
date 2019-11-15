package Com.Day_2;

import java.util.Scanner;

public class Carloan1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle");
		int p=sc.nextInt();
		System.out.println("Enter the Rate of Intrest");
		double R=sc.nextDouble();
		System.out.println("Enter the number of Year");
		int y=sc.nextInt();
		
		int n=(12*y);
		System.out.println("the number of Months" +n);
		System.out.println("    ");
		double r=(R/(12*100));
		System.out.println("The Rate of Intrest Is " +r);
		System.out.println("    ");
		
		double payment=(p*r)/(1-(Math.pow(1+r, -n)));
		System.out.println("the Monthlly payment is " +payment);
		double intrest=payment*n-p;
		System.out.println("The total rate of intrest is " +intrest);
	}


}
