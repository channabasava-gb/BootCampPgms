package Com.Day_2;

import java.util.Scanner;

public class WindChill03 {
	 public static void main(String[] args) {
		 Scanner sc1=new Scanner(System.in);
		 System.out.println("enter the temprture");
	        double t = sc1.nextDouble();
	        System.out.println("enter the velocity");
	        double v = sc1.nextDouble();
	        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	        System.out.println("Temperature = " + t);
	        
	        System.out.println("Wind speed  = " + v);
	        System.out.println("Wind chill  = " + w);
	    }

}
