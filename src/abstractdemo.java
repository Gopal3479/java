public class abstractdemo {
    public static void main(String[] args) {



    }

 abstract class gopal{
        public void call()
        {
            System.out.println("calling......");
        }
        public abstract void move();
        public abstract void music();

     public static void dance() {
     }

 }
 abstract class ram extends gopal{

         public abstract void move();{
        System.out.println("moving.....");
    }
        public abstract void music();{
        System.out.println("music........");
    }
}

 }


