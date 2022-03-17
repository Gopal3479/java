package com.company;

/*import java.util.*;
class Main
{
    public static void  (String[]args)
    {
        System.out.print("enter a string:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int original_num=number;
        int reverse=0;
        while (number!=0){
            reverse=reverse*10+number%10;
            number=number/10;
        }
        if(original_num==reverse){
            System.out.println(original_num+"  number is palindrome");
        }
        else{
            System.out.println(original_num+"  number is not palindrome");
        }

    }
}

import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String name = "Gopal reddy K A ";
        int len = name.length();
        if(len == 0)
        {
            throw new NullPointerException("NULL STRING");
        }
        else
        {
            String rev="";
            for(int i=len - 1; i >= 0; i--)
            {
                rev = rev + name.charAt(i);
            }
            System.out.println("My Name is : "+name);
            System.out.println("Reverse of My name is: "+rev);
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        int day=21;
        int month=10;
        System.out.println("before of day = "+day + " and before swapping of month = "+month);

        day = day * month;
        month = day / month;
        day = day / month;

        System.out.println("after swapping of day = "+day   +  " and after swapping of month = "+month);

    }
}
public class Main
{
    String USN;
    String Name;
    Main(String USN,String Name)
    {
        this.USN=USN;
        this.Name=Name;
    }
    public static void main(String args[])
    {
        Main object1 = new Main("ENG19CS0100","Gopal reddy K A");
        Main object2 = new Main("ENG19CS0083","Gnana prasad ");
        System.out.println("Object1: "+object1.USN+" "+object1.Name);
        System.out.println("Object2: "+object2.USN+" "+object2.Name);
    }
} */
import javax.swing.*;
class TextFieldExample
{
    public static void main(String args[])
    {
        JFrame f= new JFrame("TextField Example");
        JTextField t1,t2;
        t1=new JTextField("Welcome to Javatpoint.");
        t1.setBounds(50,100, 200,30);
        t2=new JTextField("AWT Tutorial");
        t2.setBounds(50,150, 200,30);
        f.add(t1); f.add(t2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
