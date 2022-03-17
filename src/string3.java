import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class string3
{
    public static void main(String[] args) throws Exception
    {
        //we use scanner, bufferedReader class to take a input from user
        out.println("enter a number");

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        out.println(n);

    }
}

