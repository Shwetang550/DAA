import java.util.*;

public class dfs {
	static void dfs(int s,int d,int a[][],int n)
	{
		Stack<Integer> st=new Stack<>();
		st.push(s);
		boolean visited[]=new boolean[n];
		while(st.size()>0)
		{
			int x=st.peek();
			st.pop();
			if(a[x][d]==1)
			{
				System.out.println("Yes path Exists");
				return;
			}
			else
			{
				for(int i=0;i<n;i++)
				{
					if(a[x][i]==1 && visited[i]==false)
					{
						st.push(i);
					}
				}
				visited[x]=true;
			}		
		}
		System.out.println("No such path exist");
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int s=sc.nextInt(),d=sc.nextInt();
		dfs(s-1,d-1,a,n);
	}

}
