package Com.Day_6;

public class BLRandom {
		public static void m1(String s)
		{
			s="manoj";
			System.out.print("the statndard output print=" +s);

		}
		public static void m2(String s)
		{
			s="kumar";
			System.out.println("it will print new Line=" +s );
		}
		public static void m3()
		{
			System.out.println("new Line");
		}
		public static void m4(String x,String y)
		{
			x="manoj";
			y="kumar guttedhar";
			System.out.println(" the format is *****="+ x + y);

		}

		public static void main(String[] args) {
			{
				String s = null;
				m1(s);

				String x = null,y=null;
				m4(x,y); 

			}
		}	}





