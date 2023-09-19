import java.util.*;
public class palindrome{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String x = String.valueOf(n);

        // Step 4: Reverse the string
        String reversed = new StringBuilder().reverse().toString();
        if(x.equals(reversed))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}