import java.util.Vector;

public class VectorListdemo {
    public static void main(String[] args) throws Exception
    {
        Vector<Integer> v=new Vector<>();
        v.add(6);
        v.add(12);
        v.add(56);
        v.remove(1);
        System.out.println(v.capacity());
        for(Object i:v) {
            System.out.println(i);
        }

    }
}
