import java.util.*;
class ayush
{
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		int a= in.nextInt();
		int f,s,j;
		s=a;
		f=0;
		while(a!=0)
		{
			j=a%10;
			a=a/10;
			f=f+j*j*j;
		}
		System.out.println(f);
		if(f==s)
		{
			System.out.println("ho gaya");
		}
		else
		{
			System.out.println("nai hua");
		}
	}
}
		
