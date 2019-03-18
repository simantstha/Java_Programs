import java.util.*;
class learner
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a[][]=new int[4][];
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter the number of slow learners in batch "+ (i+1));
			int n = sc.nextInt();
			int t = (int)Math.ceil(n/4.0);
			a[i] = new int[t];
			int k = 0;
			while(n>0)
			{
				a[i][k++] = (int)Math.min(4,n);
				n = n-4;
			}

		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{

			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%4==0)
					count++;
			}
			if(count==a[i].length)
				System.out.println("batch "+(i+1)+" has exactly 1:4 tutor to student ratio.");
			count=0;
		}
	}
}