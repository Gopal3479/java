import org.w3c.dom.ls.LSOutput;

public class finaldemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();


    }
static class A{
        public void show(){  //if we  use final we can access this method similarly for classes
            System.out.println("hello");//for variables we cannot modify value
        }

}
static class B extends A{
        public void show(){
            System.out.println("hi");
        }
}
}
