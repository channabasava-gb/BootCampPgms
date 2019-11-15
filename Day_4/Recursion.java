package Com.Day_4;

import java.util.Scanner;

public class Recursion {


	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		permutation(str);
	}

	public static void permutation(String input)
	{
		permutation("", input);
	}

	private static void permutation(String perm, String word)
	{
		if (word.isEmpty())
		{
			System.out.println(perm + word);

		}
		else
		{
			for (int i = 0; i < word.length(); i++)
			{
				permutation(perm + word.charAt(i), word.substring(0, i) 
						+ word.substring(i + 1, word.length()));
			}
		}

	}


}
