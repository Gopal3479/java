import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class javademo {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6);
        values.forEach(i-> System.out.println(i));
//        Consumer<Integer> cc=new Consumer<Integer>() {
//            @Override
//            public void accept(Integer i) {
//                System.out.println(i);
//            }
//        };
//        values.forEach(cc);
//        Consumer<Integer> cc=(i)-> System.out.println(i);
//        values.forEach(cc);

       values.forEach((i)-> System.out.println(i));
        System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
   }
}
