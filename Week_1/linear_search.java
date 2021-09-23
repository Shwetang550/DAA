import java.util.Scanner;
class linear_search{

   static int Search(int key,int a[],int n)
    {
       int c=0;
       for(int i=0;i<n;i++)
       {
    	 c++;
         if(a[i] == key)
         {
            System.out.print("Present ");
            return c;
         }
         
       }
       System.out.print("Not Present ");
       return c;
    }

    public static void main(String args[]){
   
    Scanner s = new Scanner(System.in);
    int n,key,t;
    t = s.nextInt();
    for(int i=0;i<t;i++)
    {
        n = s.nextInt();
        int a[] = new int[n];
        for(int j=0;j<n;j++)
          a[j] = s.nextInt();
       key = s.nextInt();
       System.out.println(Search(key,a,n));
    }

   }

}
    