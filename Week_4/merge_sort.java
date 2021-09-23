import java.util.Scanner;

public class merge_sort {
	private static int in=0,c=0;
	public static void mergesort(int ar[],int l,int r)
	{
		if(l<r)
		{
			int m=(r+l)/2;
			mergesort(ar,l,m);
			mergesort(ar,m+1,r);
			merge(ar,l,m,r);
		}
	
	}
	static void merge(int ar[],int l,int m,int r)
	{
		
		int n1=m-l+1;
		int n2=r-m;
		int L[]=new int[n1];
		int R[]=new int[n2];
		for(int i=0;i<n1;i++)
			L[i]=ar[l+i];
		for(int j=0;j<n2;j++)
			R[j]=ar[m+1+j];
		int i=0,j=0,k=l;
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
				ar[k++]=L[i++];
			else
			{
				ar[k++]=R[j++];
				in+=(m+1)-(l+i);
			}
				
			c++;
		}
		while(i<n1)
		{
			ar[k++]=L[i++];
		}
		
		while(j<n2)
		{
			ar[k++]=R[j++];
		}
	
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
		mergesort(ar,0,ar.length-1);
		System.out.println("comparison "+c+"\nInversion "+in);
		for(int j=0;j<ar.length;j++)
			System.out.print(ar[j]+" ");
		System.out.println();
		
		}	
	}

}
