import java.util.*;
class matrixTran
{
    public static void main(String args[])
    {
        int m, n, i, j;
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");
        m = in.nextInt();
        n = in.nextInt();
        int[][] a=new int[m][n];
        int[][] b=new int[n][m];
        
        System.out.println("Enter the Elements of the matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for (i = 0; i < m; i++)
        {
         for (j = 0; j < n; j++)  
         {            
            b[j][i] = a[i][j];
         }
        }
        System.out.println("The Orginal Matrix:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
            System.out.print("\n");
        }
        
        System.out.println("Transpose of the matrix:");
        
        for (i = 0; i < n; i++)
		{
         for (j = 0; j < m; j++)
               System.out.print(b[i][j]+"\t");
 
         System.out.print("\n");
		}
    }
}
