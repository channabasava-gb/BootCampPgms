package Com.Day_3;

public class giri
{
public static void main(String[] args)
{
int a[]={10,20,30,2000};
int m=0;
String bin="";
for(int i=0;i<a.length-1;i++)
{
	if(1000<a[i])
	{
		System.out.println("is year"+a[i]);
		m=a[i];
		System.out.println(m);
		
		while(m>0)
		{
			int r=m%2;
			bin=r+bin;
			 m = m/2;

		}
		System.out.println(bin);
	}
	else
	{
		System.out.println("not a year");
	}
}

}
}
