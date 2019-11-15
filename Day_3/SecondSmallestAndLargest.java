package Com.Day_3;

public class SecondSmallestAndLargest {
	 public static void main(String[] args) 
	    {
	       int n[]={1,8,7,3,9};
	        for (int i = 0; i <= n.length-1; i++) 
	        {
	            for (int j = i ; j <= n.length-1; j++) 
	            {
	                if (n[i] < n[j]) 
	                {
	                    int temp = n[i];
	                    n[i] = n[j];
	                    n[j] = temp;
	                }
	            }
	        }
	        System.out.println("second largest:"+n[1]);
	        System.out.println("second smallest:"+n[n.length-2]);
	    }

}
