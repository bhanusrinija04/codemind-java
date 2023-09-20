import java.util.*;
public class OddSum{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int Osum=0;
        for(int o:a)
        {
            if(o%2!=0)
            {
                Osum+=o;
            }
        }
        System.out.println(Osum);
    }
}