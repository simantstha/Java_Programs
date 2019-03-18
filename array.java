import java.util.*;
class bubblesort
{
    public static void main(String args[])
    {
        int a[]=new int[10];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}