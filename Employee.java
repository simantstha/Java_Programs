import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Scanner;

public class Employee {
    String name,addr,contact;

    public static void main(String[] args) throws IOException{
        int n, i;

        // delete existing file first
        try{
            Files.deleteIfExists(Paths.get("employees.txt"));
        }
        catch(NoSuchFileException e)
        {
            System.out.println("No such file/directory exists");
        }
        catch(IOException e)
        {
            System.out.println("Invalid permissions.");
        }
        System.out.println("Deletion successful.");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Employees: ");
        n = sc.nextInt();
        sc.nextLine();
        Employee arr[] = new Employee[n];                                // creating array of n Employees

        ByteArrayOutputStream outputstream = new ByteArrayOutputStream();
        FileOutputStream fos = new FileOutputStream("employees.txt");    // creating file to write to

        for(i = 0; i < n; i++){
            arr[i] = new Employee();                                  // initializing new Employee
            //taking input from user
            System.out.print("Name: ");
            arr[i].name = sc.nextLine();
            System.out.print("Address: ");
            arr[i].addr = sc.nextLine();
            System.out.print("Contact: ");
            arr[i].contact = sc.nextLine();

            // concatenating all properties in employee object
            // and converting to a byte stream
            outputstream.write(("Employee " + (i+1) + "\n").getBytes());
            outputstream.write("----------------\n".getBytes());
            outputstream.write("Name: ".getBytes());
            outputstream.write(arr[i].name.getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write("Address: ".getBytes());
            outputstream.write(arr[i].addr.getBytes());
            outputstream.write("\n".getBytes());
            outputstream.write("Contact: ".getBytes());
            outputstream.write(arr[i].contact.getBytes());
            outputstream.write("\n".getBytes());
        }
        byte c[] = outputstream.toByteArray();
        fos.write(c); 
        fos.close();
        ByteArrayOutputStream outputstream1 = new ByteArrayOutputStream();
        FileOutputStream fos1 = new FileOutputStream("employees.txt"); 
        System.out.print("Enter the name employee to modify:  ");
        String nam= sc.nextLine();
        for(i=0;i<n;i++)
        {
            if(arr[i].name.equals(nam))
            {
                System.out.print("Enter the new Address and contact: ");
                arr[i].addr=sc.nextLine();
                arr[i].contact=sc.nextLine();
            }
            try{
                Files.deleteIfExists(Paths.get("employees.txt"));
            }
            catch(NoSuchFileException e)
            {
                System.out.println("No such file/directory exists");
            }
            outputstream1.write(("Employee " + (i+1) + "\n").getBytes());
            outputstream1.write("----------------\n".getBytes());
            outputstream1.write("Name: ".getBytes());
            outputstream1.write(arr[i].name.getBytes());
            outputstream1.write("\n".getBytes());
            outputstream1.write("Address: ".getBytes());
            outputstream1.write(arr[i].addr.getBytes());
            outputstream1.write("\n".getBytes());
            outputstream1.write("Contact: ".getBytes());
            outputstream1.write(arr[i].contact.getBytes());
            outputstream1.write("\n".getBytes());
        }
        // create a byte array to be written
        byte d[] = outputstream1.toByteArray();
        fos1.write(d);                                          // writing byte array to file
        fos1.close();
    }
}

