import java.util.*;
class board
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int r=in.nextInt();
        System.out.print("Enter the no of columns: ");
        int c=in.nextInt();
        String[][] mat= new String[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=in.nextLine();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
