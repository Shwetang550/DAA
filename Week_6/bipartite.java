import java.util.*;


public class bipartite {
	static void bfs(int a[][],int n)
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(0);
		int c[]=new int[n];
		c[0]=1;
		int curr=1;
		while(q.size()>0)
		{
			int x=q.remove();
			if(a[x][x]==1)
			{
				System.out.println("Not Bipartite");
				return;
			}
			else
			{
				curr*=-1;
				for(int i=0;i<n;i++)
				{
					if(a[x][i]==1 && c[i]==0)
					{
						q.add(i);
						c[i]=curr;
					}
					else if(a[x][i]==1 && c[i]==c[x])
					{
						System.out.println("Not Bipartite");
						return;
					}
				}
			
			}		
		}
		System.out.println("Bipartite");
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
	bfs(a,n);
	}

}
