import java.util.*;
class bubblesort
{
    public static void main(String args[])
    {
        int a[]=new int[6];
        int temp=0;
        Scanner in = new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
    }
}