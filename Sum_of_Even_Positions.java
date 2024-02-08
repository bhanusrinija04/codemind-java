import java.util.Scanner;
class EvenPositions{
    public static void SumOfEvenPos(int[] a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}
public class Demo{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        EvenPositions o=new EvenPositions();
        o.SumOfEvenPos(a);
    }
}