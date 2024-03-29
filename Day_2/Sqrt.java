package Com.Day_2;

import java.util.Scanner;

public class Sqrt {
	 public static void main(String[] args) { 

	        // read in the command-line argument
		 Scanner sc1=new Scanner(System.in);
		 System.out.println("Enter the number");
	        double c = sc1.nextDouble();
	        double epsilon = 1.0e-15;  // relative error tolerance
	        double t = c;              // estimate of the square root of c

	        // repeatedly apply Newton update step until desired precision is achieved
	        while (Math.abs(t - c/t) > epsilon*t) {
	            t = (c/t + t) / 2.0;
	        }

	        // print out the estimate of the square root of c
	        System.out.println(t);
	    }
	 

}
