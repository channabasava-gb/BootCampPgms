package Com.Day_5;

import java.util.Arrays;
import java.util.Scanner;

public class StaticMinAndMaxOverride {
	public void largMinString(String str)
	{
		
		char arr[] = str.toCharArray();
		
		Arrays.sort(arr);
		
		
		char min = arr[0];
		System.out.println("Smallest Character = "+min);
		
		char max = arr[arr.length-1];
		System.out.println("Largest character = "+max);
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str  = sc.nextLine();
		
		StaticMinAndMaxOverride sm = new StaticMinAndMaxOverride();
		sm.largMinString(str);
		
	}
	
}
