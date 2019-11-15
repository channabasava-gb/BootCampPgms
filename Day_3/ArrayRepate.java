package Com.Day_3;

public class ArrayRepate {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,10,20};
		{

			for(int i=0;i<a.length-1;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if((a[i]==a[j]))
					{
						System.out.println("Duplicate are"
								+a[i]);
					}

				}
			}
		}
	}


}
