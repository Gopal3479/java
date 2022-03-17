
import java.util.Scanner;

public class febonacci
{
    public static void main(String[] args)
    {
        int k=1;
        int a=1;
        int b=1;

        Scanner sc = new Scanner(System.in);
        k=0;
        System.out.println("enter a number");
        int h= sc.nextInt();
        System.out.print("1 1 ");
        while(k<=h)
        {
           k=a+b;
            System.out.print(k + " ");
            a=b;
            b=k;
        }
    }
}
