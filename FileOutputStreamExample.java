import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("testout.txt");    
             String s="Welcome to javaTpoint.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b,2,3);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  