import java.util.*;
public class Main
{
    public static void main(String[] a)
    {
        Scanner in= new Scanner(System.in);
      	String b=in.nextLine();
      	Main obj= new Main();
      	if(obj.pronic(b))
        {
			System.out.println(b+" is a Pronic Number");
        }
      	else
        	System.out.println(b+" is not a Pronic Number");
      	
    }
  	boolean pronic(String s)
    {
      String[] a= s.split("");
      int b=Integer.parseInt(a[0]);
      int c=Integer.parseInt(a[1]);
      int d=b*c;
      String f=Integer.toString(d);
      String[] e=f.split("");
      int flag=0;
      for(int i=0;i<e.length;i++)
      {
        for(int j=0;j<a.length;j++)
        {
          if(e[i].equals(a[j]))
          {
            a[j]="X";
            flag++;
          }
        }
      }
      if(flag==2)
        return true;
      else
        return false;
    }
}
