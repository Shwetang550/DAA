import java.util.Scanner;

public class differences {
	public static int Count(int a[],int n,int key)
	{
		int c=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(Math.abs(a[i]-a[j])==key)
					c++;
			}
		}
		return c;
	}
	public static void main(String args[])
	{
		int t;
		Scanner s = new Scanner(System.in);
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
	        int key = s.nextInt();
			System.out.println(Count(a,n,key));
				
		}
	}

}