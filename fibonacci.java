import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        System.out.print("Enter value of n: ");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int c=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=0;i<n-2;i++)
        {
            System.out.print(c+" ");
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println("");

    }
}