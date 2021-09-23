import java.util.Scanner;

public class quick_sort {
	
	public static int c=0,swap=0;
	static void sort(int ar[],int l,int r)
	{
		if(l<r)
		{
		int p=partition(ar,l,r);
		sort(ar,l,p-1);
		sort(ar,p+1,r);
		}
	}

	static int partition(int ar[],int l,int r)
	{
		int p = ar[r];
		int i=l-1;
		for(int j=l;j<=r-1;j++)
		{
			if(ar[j]<p)
			{
				i++;
				int t=ar[i];
				ar[i]=ar[j];
				ar[j]=t;
				swap++;
			}
			c++;
		}
		int t=ar[i+1];
		ar[i+1]=ar[r];
		ar[r]=t;
		swap++;
		return i+1;
	}

	public static void main(String args[])
	{
		int t;
		Scanner s = new Scanner(System.in);
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int ar[]=new int[n];
			for(int j=0;j<n;j++)
				ar[j]=s.nextInt();
			sort(ar,0,n-1);
	    System.out.println("comparison "+c+"\nswaps "+swap);
		for(int j=0;j<ar.length;j++)
			System.out.print(ar[j]+" ");
		System.out.println();
	     }
	}
}
