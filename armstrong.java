import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        System.out.print("Enter the value n: ");
        Scanner in= new Scanner(System.in);
        int n= in.nextInt();
        int sum=0,r,temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("It is Armstrong");
        }
        else{
            System.out.println("It is not Armstrong");
        }
    }
}
