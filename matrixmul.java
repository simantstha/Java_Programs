import java.util.*;
class matrixmul
{
    public static void main(String args[])
    {
        int m, n, o, p;
        Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of first matrix");
		m = in.nextInt();
		n = in.nextInt();
		int m1[][]= new int[m][n];
		System.out.println("Enter the number of rows and columns of second matrix");
		o = in.nextInt();
		p = in.nextInt();
		int m2[][]= new int[o][p];
		int pro[][]= new int[m][p];
		int sum=0;
		if (n != o)
		{
         System.out.println("The matrices can't be multiplied with each other.");
        }
        else
        {
			System.out.println("Enter elements of first matrix");
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					m1[i][j]=in.nextInt();
				}
			}
			System.out.println("Enter elements of Second matrix");
			for(int i=0;i<o;i++)
			{
				for(int j=0;j<p;j++)
				{
					m2[i][j]=in.nextInt();
				}
			}
			for (int i = 0; i < m; i++)
			{
				for (int j = 0; j <p ; j++)
				{  
					for (int k = 0; k < o; k++)
					{
						sum = sum + m1[i][k]*m2[k][j];
					}
					pro[i][j] = sum;
					sum = 0;
				}
			}
			
			System.out.println("The Product is:");
			for (int i = 0; i < m; i++)
			{
				for (int j = 0; j < p; j++)
				{
				System.out.print(pro[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
		
    }
}
