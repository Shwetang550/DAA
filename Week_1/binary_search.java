import java.util.Scanner;
public class binary_search {
    public static int binarySearch(int arr[],int n,int key)
	{
		int l=0,h=n-1,c=0,m;
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
			System.out.println(binarySearch(arr,n,key));
		}
	}

}
