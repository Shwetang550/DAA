import java.util.Scanner;
class linear_search{

    public static void main(String args[]){
   
    Scanner s = new Scanner(System.in);
    int n,key;
    System.out.println("Enter size of array : ");
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter the elements of array : ");
    for(int i=0;i<n;i++)
       a[i] = s.nextInt();
    System.out.println("Enter Key : ");
    key = s.nextInt();
    for(int i=0;i<n;i++)
    {
         if(a[i] == key)
         {
            System.out.println("key found at Index : "+i);
            return;
         }
    }
    System.out.println("key not found");

    }

}
    