import java.util.Scanner;
public class Duplicate_Key_element {
	
	public static int Search(int a[],int n,int key)
	{
		int l=0,h=n-1,m,c=0,x=0;
		while(l<=h)
		{
			m=l+((h-l)/2);
			if(a[m]==key)
			{
			if((m==n-1 || a[m+1]>key))
			{
				h = m-1;
				c+=m;
				x++;
			}
			if(m==0 || a[m-1]<key)
			{
				l=m+1;
				c-=m;
				x++;
			}
			else 
				l=l+1;
			if(x==2)
				return c+1;
			}
			else
			{
				if(a[m]>key)
					h=m-1;
				else
					l=m+1;
			}
		}
		return c;
	}
	public static void main(String arg[])
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
			int key=s.nextInt();
			if(Search(a,n,key)<=0)
				System.out.println("key not present");
			else
				System.out.println(key+"-"+Search(a,n,key));
		}
	}

}
