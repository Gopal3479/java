public class poly {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();

    }
//static class A{ //method overloading
//        public void show(){
//            System.out.println("hello");
//        }
//        public  void show(int i){
//            System.out.println("with parameter");
//
//        }
//        public void show(double d){
//            System.out.println("with double");
//        }
//}

 static class A{
        public void show(){
            System.out.println("hello"); // method overriding
        }
 }
static class B extends A{
        public void show(){
            System.out.println("class B");
        }
}


}
