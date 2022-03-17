public class palindrome
{
    public static void main(String[] args)
    {
        int n = 123;
        int t = n;
        int r;
        int s = 0;
        while (n>0) {
            r = n%10;
            n = n/10;
            s = s * 10 + r;
        }


            if (t == s)
                System.out.println("the number is palindome");
            else
                System.out.println("the number is not palindrome");
        }
    }

