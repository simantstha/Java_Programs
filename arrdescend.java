class arrdescend
{
	public static void main(String args[])
	{
		int [] ar = {1,2,3,4,5,6,7,8,9,10};
		int temp=0;
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println("");
	}
}
			
