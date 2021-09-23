import java.util.Scanner;

public class Three_indices {
	public static void Search(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[i]+a[j]==a[k])
					{
						System.out.println((i+1)+" "+(j+1)+" "+(1+k));
						return;
					}
				}
			}
		}
		System.out.println("No sequence found ");
		
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
	
			Search(a,n);
				
		}
	}

}
