import java.util.Scanner;

public class Duplicate_element_present {
	public static void sort(int ar[],int l,int r)
	{
		if(l<r)
		{
			int m=(r+l)/2;
			sort(ar,l,m);
			sort(ar,m+1,r);
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
				ar[k++]=R[j++];
				
		}
		while(i<n1)
			ar[k++]=L[i++];
		while(j<n2)
			ar[k++]=R[j++];
	
	}
	static String search(int a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
				return "yes";
		}
		return "No";
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
	        System.out.println(search(ar));
		 }
	}

}
