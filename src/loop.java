import java.util.Scanner;

public class loop {
    public static void main(String[] args){
        /*Scanner n=new Scanner(System.in);*/
        gopal:
        for(int i=1;i<=127;i++){

           for(int j=1;j<=i;j++) {
                if(i==127)
                    break gopal;
                System.out.print("  *  ");
            }
            System.out.println();



        }
    }
}
