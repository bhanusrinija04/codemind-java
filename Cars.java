import java.util.*;
public class Cars
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(n%4==0?n/4:(n/4)+1);
        if(n%4==0)
        {
            System.out.println(n/4);
        }
        else
        {
            System.out.println((n/4)+1);
        }
    }
}