public class exceptiondemo
{
    public static void main(String[] args)
    {
        int i,j,k=0;
        i=5;
        j=5;
        int a[]=new int[4];

        try
        {
            k = i /j;
            for(int c=0;c<=4;c++){
                a[c]=c+1;
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println("you cannot divide with zero:"+e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("maximum range is reached"+e);
        }
        finally {
            System.out.println("bye");
        }

    }
}
