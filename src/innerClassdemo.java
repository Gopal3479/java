//public class innerClassdemo {
//    public static void main(String[] args) {
//        A a=new A();
//        //A.B b=a.new B();
//        A.B b=new A.B();
//        b.show();
//    }
//}
//class A
//{
//    int roolnum;
//    String Sname;
//    static class B{  // for static class
//        public void show() {
//            System.out.println("hello");
//        }
//
//    }
//
//
//}

public class innerClassdemo {
    public static void main(String[] args) {
       A a=new A(){
           public void show(){
               System.out.println("hello,hi good");  //ananymous class

           }

       };
       a.show();

    }
}
class A
{
    public void show(){
        System.out.println("hello");

    }


}