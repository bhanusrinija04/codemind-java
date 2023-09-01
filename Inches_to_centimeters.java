import java.util.Scanner;
public class centimeter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        double c=2.54,conv;
        conv=(double)c*h;
        System.out.printf("%.2f",conv);
    }
}