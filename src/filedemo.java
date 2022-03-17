import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filedemo
{
    public static void main(String[] args)  throws Exception
    {

        FileOutputStream fos=new FileOutputStream("demo.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("this is demo content");
        FileInputStream fis=new FileInputStream("demo.txt");
        DataInputStream dis=new DataInputStream(fis);
        String str= dis.readUTF();
        System.out.println(str);
    }
}
