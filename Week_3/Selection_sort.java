import java.util.Scanner;

public class Selection_sort {
	
	public static void sort(int a[],int n)
	{
		int c=0,s=0;
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min])
					min=j;
				c++;
			}
			int t=a[i];
			a[i]=a[min];
			a[min]=t;
			s++;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		System.out.println("comparisons = "+c);
		System.out.println("swaps = "+s);
	}
	public static void main(String agr[])
	{
		int t;
		Scanner s = new Scanner(System.in);
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n;
			n=s.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			sort(a,n);
		}
	}

}
