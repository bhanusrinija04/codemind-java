import java.util.*;
public class Appearance{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0;
        int k=sc.nextInt();
        for(int v:a)
        {
            if(k==v)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}