import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        System.out.print("Enter the value of n: ");
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int sum=1;
        for(int i=1;i<=n;i++)
        {
            sum=sum*i;
        }
        System.out.println("The Factorial is: "+sum);
    }
}