import java.util.Scanner;

public class pair_sum {

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
			}
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
	public static void pair(int key,int ar[])
	{
		int l=0,r=ar.length-1,flag=0;
		while(l<r)
		{
			if(ar[l]+ar[r]==key)
			{
				System.out.print(ar[l]+" "+ar[r]+", ");
				flag=1;
				l++;
			}
			else if(ar[l]+ar[r]>key)
               r--;
            else
               l++;	
		}
		if(flag==0)
			System.out.println("No such pair exist");
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
			int key=s.nextInt();
		   mergesort(ar,0,ar.length-1);
		   for(int j=0;j<ar.length;j++)
			   System.out.println(ar[j]);
		   pair(key,ar);
		}	
	}

}
