import java.util.*;
class hash
{
	static String rotate(String s)
	{
		int len= s.length();
		String b= new String("");
		b+=s.charAt(len-1);
		for(int i=0;i<s.length()-1;i++)
		{
			b+=s.charAt(i);
		}
		System.out.println("Rotated: "+b);
		return b;
	}
	void shift(String b)
	{
		int [] ar= new int[b.length()/2];
		int count=0;
		int sum=0;
		for(int i=0;i<b.length();i=i+2)
		{
			ar[count++]=Integer.parseInt(b.substring(i,i+2));
		}
		for(int i=0;i<b.length()/2;i++)
		{
			sum+=ar[i];
		}
		System.out.println("The Segments are");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		String a= String.valueOf(sum);
		
		System.out.println("Final Answer: "+a.substring(1,a.length()));
		
	}
			
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		hash obj= new hash();
		obj.shift(rotate(in.nextLine()));
	}
}
