import java.util.*;
class hello
{
    public static int ram(int a)
    {
        int sum=0;
        int r=0;
        while(a>0)
        {
            r=a%10;
            a=a/10;
            sum+=r;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the No of Integers: ");
        int n= in.nextInt();
        int ar[]=new int[n];
        int ar1[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=in.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            if(ram(ar[0])==ram(ar[i]))
            {
                ar1[count++]=ar[i];
            }
        }
        System.out.println("The no is "+ar[0]);
        for(int i=0;i<n;i++)
        {
            if(ar1[i]!=0)
            {
                System.out.print(ar1[i]);
            }
        }
        System.out.println();
    }
}