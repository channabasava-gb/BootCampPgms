 package Com.Day_1;

import java.util.Scanner;

//Write a program PrintThreeNames
public class Pgm01 {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter The Three Names");
		String str=sc1.nextLine();
		
		String a[]=str.split(" ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
		
	}
	

}
