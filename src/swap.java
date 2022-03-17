public class swap {
    public static void main(String[] args){
        int a=5;
        int b=6;
        //int temp;

        //temp=a;
       // a=b;
       // b=temp;


       // a=a+b;
        //b=a-b;
        //a=a-b;


       // a=a^b;
       // b=a^b;
       // a=a^b;

        b=a+b-(a=b);

        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }
}
