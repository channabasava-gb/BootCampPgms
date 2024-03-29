package Com.Day_4;

import java.util.Scanner;

public class Permutation {
	static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	// Recursive function to generate all permutations of a String
	 static void permutations(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) 
		{
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}

	// generate all permutations of a String in Java
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		permutations(s.toCharArray(), 0);
	}


}
