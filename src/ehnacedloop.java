import java.util.Random;

public class ehnacedloop {
    public static void main(String[] args) {
        int n[]=new int[12];
        Random r=new Random();

        for(int i=0;i<n.length;i++){
            n[i]=r.nextInt(50);


        }
        for(int k:n){
            System.out.println(k);
        }


    }
}
