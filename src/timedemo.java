import java.util.ArrayList;

public class timedemo {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();  //it wil start time from 1970 jan 1
        System.out.println(start);
        ArrayList a=new ArrayList();
        for(int i=1;i<100000;i++){
            a.add(i);

        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
}
