import java.util.*;
import java.io.*;
class charsinF
{
    public static void main(String args[])
    {
        try
        {
            Writer ob= new FileWriter("hasnain.txt");
            System.out.print("Enter the Content you want to write in file:");
            Scanner in = new Scanner(System.in);
            String s= in.nextLine();
            ob.write(s);
            ob.close();
            FileReader fr= new FileReader("hasnain.txt");
            int i=fr.read();
            int c=0;   
            while(i!=-1)
            {
                if(i!=32)
                {
                    c++;
                }
                i=fr.read();
            }
            fr.close();
            System.out.println("Number of Characters: "+c);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
