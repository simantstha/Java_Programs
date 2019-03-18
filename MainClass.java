import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Junk implements Serializable {
    String str;
    int i;
    public Junk(String s,int b) {
      str = s;
      i=b;
    }
  
}
public class MainClass { 
    public static void main(String[] args) throws Exception {
    Junk obj1 = new Junk("A",2);
    Junk obj2 = new Junk("B",3);
    Junk obj3 = new Junk("V",4);
    ObjectOutputStream objectOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("junk.bin")));
    objectOut.writeObject(obj1); // Write object
    objectOut.writeObject(obj2); // Write object
    objectOut.writeObject(obj3); // Write object
    objectOut.close(); // Close the output stream

    ObjectInputStream objectIn = null;
    int objectCount = 0;
    Junk object = null;

    objectIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("junk.bin")));

    // Read from the stream until we hit the end
    while (objectCount < 3) {
      object = (Junk) objectIn.readObject();
      objectCount++;
      System.out.println(object.str+" "+object.i);
    }

    objectIn.close();

  }
}
