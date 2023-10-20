import java.util.*;
public class EvenOdd{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int[] Odd=new int[a.length];
        int[] even=new int[a.length];
        int oddCount=0,evenCount=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even[evenCount]+=a[i];
                evenCount++;
            }
            else
            {
               Odd[oddCount]+=a[i];
               oddCount++;
            }
        }
        for(int i=0;i<evenCount;i++)
        {
            System.out.print(even[i]+" ");
        }
        for(int i=0;i<oddCount;i++)
        {
            System.out.print(Odd[i]+" ");
        }
    }
}