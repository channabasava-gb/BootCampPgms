package Com.Day_2;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args)
    {
		 Scanner s = new Scanner(System.in);
        System.out.println("Enter any number : ");
       
        double temp=0.0;
       double num = s.nextDouble();
       for(int i=1;i<=num;i++)
       {
    	   double m=1.0/i;
    	   temp=temp+m;
    
       }
       System.out.println(temp);
       
    }


}
