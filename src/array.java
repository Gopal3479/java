import java.util.Random;

public class array {
    public static void main(String[] args){
        Random r=new Random();

        int a[]=new int [20];

        for(int i=0;i<a.length;i++){
            a[i]=r.nextInt(50);

        }
        try {
            System.out.println(a[52]);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        for(int i:a){
            System.out.println(i);
        }
    }
}
