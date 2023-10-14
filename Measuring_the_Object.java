import java.util.*;
public class MEasure
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(w==(x+y+z)||w==(x+y)||w==(y+z)||w==(x+z)||w==x||w==y||w==z)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}