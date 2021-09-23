import java.util.Scanner;

public class jump_search {
	public static int jumpSearch(int arr[],int n,int key)
	{
		int jump = (int)Math.floor(Math.sqrt(n)),c=0;
		int step = jump,prev=0;
		while(arr[Math.min(step, n)-1]<key)
		{
			c++;
			prev = step;
			step+=jump;
			if(prev>=n)
			{
				System.out.print("Not Present ");
				return c;
			}
		}
		while(arr[prev]<key)
		{
			prev++;
			if( prev==Math.min(n, step))
			{
				System.out.print("Not Present ");
				return c;
			}
			c++;
		   
		}
		if(arr[prev]==key)
     	{
		c++;
		System.out.print("Present ");
		return c;
	   }
		
		System.out.print("Not Present ");
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
			System.out.println(jumpSearch(arr,n,key));
		}
	}
}
