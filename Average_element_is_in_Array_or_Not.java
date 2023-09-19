import java.util.*;
public class Avg{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int a:arr)
        {
            sum+=a;
        }
        double average=(int)sum/n;
        int count=0;
        for(int a:arr)
        {
            if(a==average)
            {
                count=1;
            }
        }
        if(count==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}