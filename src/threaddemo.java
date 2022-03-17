public class threaddemo
{
    public static void main(String[] args) throws Exception
    {
        hi obj=new hi();
        hello obj1=new hello();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.start(); //obj.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();//obj1.start();
        t1.join();
        t2.join();
        System.out.println(t1.isAlive());
        System.out.println("bye");
    }

}
class hi implements Runnable//extends Thread
{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class hello implements Runnable //extends Thread
{
    @Override
    @SuppressWarnings("unchecked")
    public void run(){                     //@functional interface it contains only one method otherwise it will get error
        for(int i=1;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
