package Com.Day_2;

import java.util.Scanner;

public class GamlingSimulator {
	  public static void main(String[] args) {
		          Scanner sc=new Scanner(System.in);
		          System.out.println("Enter the Stake");
		          int stake=sc.nextInt();
		          System.out.println("Enter the Goal");
		          int goal=sc.nextInt();
		          System.out.println("Enter the trials");
		          int trials=sc.nextInt();
		          
		          int bets=0;// total number of bets
		          int wins=0;//total number of wins
		          //repeat the loop trials
		          for(int i=0;i<trials;i++)
		          {
		                  int cash=stake;
		                  while(cash>0 && cash<goal)
		                  {
		                          bets++;
		                          if(Math.random() < 0.5)
		                                  cash++; //win $1
		                          else
		                                  cash--; //loss//$1
		                  }
		                  if(cash==goal)
		                          wins++;
		                  
		          System.out.println(wins + " wins of" +trials);
		          System.out.println("the percentage of win is" +100.0 * wins / trials);
		      System.out.println("the average result is" +1.0 * bets/trials);                
		          sc.close();
		          }
		         }

      


}
