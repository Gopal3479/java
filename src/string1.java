import java.util.Locale;
import java.util.Scanner;

public class string1
{
    public static void main(String[] args) {
        String s1;
        String s2;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 2 strings");
        s1= sc.nextLine();
        s2=sc.nextLine();

       int len=s1.length();
       int len1=s2.length();
        System.out.println("lenghts of 2 strings are" +len+","+len1);

        String c=s1.concat(s2);
        System.out.println("concation of string is "+c);

        String u=s1.toUpperCase(Locale.ROOT);
        System.out.println(u);









    }
}
