package Com.Day_2;

public class Stats5 {
	public static void main(String[] args) {
		int n=5;
		double x=Math.random();
		double max=x;
		double min=x;
		double average=x;
		
		while(n>0)
		{
			System.out.println("the random values" +x);
			x=Math.random();
			
			max=Math.max(x, max);
			min=Math.min(x, min);
			average=average+x;
			n--;
		}
		System.out.println("the max : " +max);
		System.out.println("the min is "+min);
		System.out.println("ävaerage :" + average/5);
		
	}

}
