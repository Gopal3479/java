import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //eg:153,1*1*1+5*5*5+3*3*3==153
        System.out.print("enter a number");
        int n=sc.nextInt();
        int temp=n;
        int r,sum=0;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        if(temp==sum){
            System.out.println("the number is armstrong");

        }
        else{
            System.out.println("not a armstrong number");
        }
    }
}
