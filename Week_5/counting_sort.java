import java.util.Scanner;

public class counting_sort {
	static void Max(char[] ar,int n)
	{
		int a[]=new int[26];
		char c='a';
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			a[ar[i]-'a']+=1;
		}
		for(int i=0;i<26;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				c=(char) ('a'+i);
			}
		}
		if(max<=1)
			System.out.println("No Duplicates Present");
		else
		    System.out.println(c+" - "+max);
	  
	}
	public static void main(String args[])
	{
		int t;
		Scanner s = new Scanner(System.in);
		t=s.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			char ar[]=new char[n];
			for(int j=0;j<n;j++)
				ar[j]=s.next().charAt(0);
			Max(ar,n);
		}
	}

}
