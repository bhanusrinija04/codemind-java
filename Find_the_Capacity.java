import java.util.Scanner;
public class Capacity
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s,t,b;
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        int kb=1024;
        int c=2*s*t*b*512;
        int tkb=c/kb;
        System.out.printf("%dKB",tkb);
    }
}