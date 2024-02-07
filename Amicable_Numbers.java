import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0,sum2=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            {
                sum+=i;
            }
        }
        for(int i=1;i<b;i++)
        {
            if(b%i==0)
            {
                sum2+=i;
            }
        }
        System.out.println(sum==b&&sum2==a?"Amicable":"Not Amicable");
    }
}