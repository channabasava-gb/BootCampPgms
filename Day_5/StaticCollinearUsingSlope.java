package Com.Day_5;

public class StaticCollinearUsingSlope {
	public void checkCollinear(int x1,int y1,int x2,int y2,int x3,int y3)
	{
		
		int ab = (y2-y1)/(x2-x1);
		int bc = (y3-y2)/(x3-x2);
		int ac = (y3-y1)/(x3-y1);
		
		if(ab == bc && bc== ac && ab == ac)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("False");
		}
		
	}
     public static void main(String args[])
     {
    	 StaticCollinearUsingSlope scus = new StaticCollinearUsingSlope(); 
    	 
    	 int x1 = 2, y1 = 4;
    	 int x2 = 4, y2 = 6;
    	 int x3 = 6, y3 = 8;
    	 
    	 scus.checkCollinear(x1, y1, x2, y2, x3, y3);
    	 
    	 
    	 
     }


}
