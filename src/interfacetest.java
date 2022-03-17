

interface ABC
{
     void show();
}
class  test2 implements ABC
{
    public void show()
    {
        System.out.println("hello");
    }

}
public class interfacetest
{
    public static void main(String[] args)
    {
        ABC obj=new test2();

        obj.show();

    }
}
