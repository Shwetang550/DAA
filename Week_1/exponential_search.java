import java.util.Scanner;

public class exponential_search {
	static int  linearSearch(int arr[],int s,int e,int key,int c)
	{
		int i=0;
		for(i=s;i<=e;i++)
		{
			c++;
			if(arr[i]==key)
			{
				System.out.print("Present ");
				return c;
			}
		}
		System.out.print("Not present ");
		return c;
	}
	static int binarySearch(int arr[],int l ,int h,int key,int c)
	{
		int m;
		while(l<=h)
		{
			m=l+((h-l)/2);
			c++;
			if(arr[m]==key)
			{
				System.out.print("Present ");
				return c;
			}
			else if(arr[m]>key)
			{
				h=m-1;
			}
			else if(arr[m]<key)
			{
				l=m+1;
			}
		}
		System.out.print("Not present ");
		return c;
	}
	public static int exponentialSearch(int arr[],int n,int key)
	{
		int c=1,i=1;
		if(arr[0]==key)
		{
			System.out.print("Present ");
			return c;
		}
		while(i<n && arr[i]<=key)
		{
			i=i*2;
			c++;
		}
		return linearSearch(arr,i/2,n-1,key,c);
		//return binarySearch(arr,i/2,Math.min(n-1, i),key,c);
	}
	public static void main(String args[])
	{
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int arr[] = new int[n];
			for(int j=0;j<n;j++)
				arr[j]=sc.nextInt();
			int key = sc.nextInt();
			System.out.println(exponentialSearch(arr,n,key));
		}
	}

}
