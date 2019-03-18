import java.util.*;
public class jagged
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int[][] ar=new int[4][];
        for(int i=0;i<4;i++)
        {
            System.out.print("Enter the no of items: ");
            int n= in.nextInt();
            ar[i]=new int[n];
            for(int j=0;j<n;j++)
            {
                ar[i][j]=j;
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}