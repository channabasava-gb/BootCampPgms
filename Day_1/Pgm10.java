 package Com.Day_1;

public class Pgm10 {
	 public static void main(String[] args) {
	        int SIDES = 6;
	        int a = 1 + (int) (Math.random() * SIDES);
	        int b = 1 + (int) (Math.random() * SIDES);
	        System.out.println("the random value of a" +a);
	        System.out.println("the value of b is " +b);
	       
	        int sum = a + b;
	        
	        System.out.println("the total sum is "+sum);
	    }

}
