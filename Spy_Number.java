import java.util.*;
public class Spy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp,prod=1,sum=0;
        while(n!=0)
        {
            temp=n%10;
            prod*=temp;
            sum+=temp;
            n/=10;
        }
        System.out.println(prod==sum?"Spy Number":"Not Spy Number");
    }
}