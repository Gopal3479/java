import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collectiondemo {
    public static void main(String[] args) {
        Collection<Integer> values=new ArrayList<>();
        values.add(5);
        values.add(4);
        values.add(8);
        values.remove(4);

//        values.add("gopal");
//        values.add(5.6f);



//        Iterator i= values.iterator();  //fetching values using iterators
//
//        while(i.hasNext())
//            System.out.println(i.next());

    for(int i:values){
        System.out.println(i);
    }





    }
}
