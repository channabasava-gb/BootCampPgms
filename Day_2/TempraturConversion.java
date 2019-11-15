package Com.Day_2;

import java.util.Scanner;

public class TempraturConversion {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter the faranhit");
		double f=sc1.nextDouble();
	//	System.out.println("genarate the celsices");
	//	double c=sc1.nextDouble();
		
		double cel=(f-32)*5/9;
	//	double f1=(c*9/5)+32;
		
	//	System.out.println("faranhit value is:"+f1);
		System.out.println("celsices value is:"+cel);
		
		
		
	}

}
