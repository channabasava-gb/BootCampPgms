package Com.Day_3;

public class year {
	public static void ye(int a[])
	{
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>999&&a[i]<10000)
			{
				
			 if(a[i]>1900 && a[i]<2019)
			{
				 System.out.println("leap year:"+a[i]);
				 int n=a[i];
				 System.out.println("th e===="+n);
			}
			}
			else
			{
				System.out.println("its not not" +a[i]);
			}
		}
	}
//	public static int binary(Object a)
//	
//	{
//
//		int rem[]=new int[(int) a];
//		int index=0;
//		for(int i=0;i<a;i++)
//		{
//			while(a>0)
//			{
//				rem[index]=a%2;
//				index++;
//				a=a/2;
//			}
//			System.out.println("sgjsgjdg"+a);
//		}
//		return a;
//		
//	}
				
	public static void main(String[] args) {
		int a[]={1,2,2018,2019,111,2000,1890};
	ye(a);
	year y=new year();
	y.binary(a);
	}

}
	