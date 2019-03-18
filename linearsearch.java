import java.util.*;
class linearsearch
{
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
        int[] ar = {3,4,2,1,6,9,5};
        int a=-1;
        System.out.print("Enter the number you want to search: ");
        int n= in.nextInt();
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==n)
            {
                a=i;
                break;
            }
        }
        if(a>=0)
        {
            System.out.println("It is in position: "+a);
        }
        else
        {
            System.out.println("It is not in the array");
        }
    }
}