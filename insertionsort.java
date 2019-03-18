import java.util.*;
class insertionsort
{
    public static void main(String args[])
    {
        int[] ar= new int[6];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            ar[i]=in.nextInt();
        }
        for (int i=1; i<ar.length; ++i) 
        { 
            int key = ar[i]; 
            int j = i-1; 
            while (j>=0 && ar[j] > key) 
            { 
                ar[j+1] = ar[j]; 
                j = j-1; 
            } 
            ar[j+1] = key; 
        } 
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println(" ");
    }
}