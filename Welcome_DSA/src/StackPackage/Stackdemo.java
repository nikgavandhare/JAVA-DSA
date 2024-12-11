package StackPackage;

import java.util.Stack;

public class Stackdemo
{

    public static void main(String[] args)
    {
        //*********************  LIFO  ****************************************************
        StackRunner s1=new StackRunner();
        System.out.println("empty status(BEFORE):"+ s1.IsEmpty());

        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.push(60);

        System.out.println("pop element is: "+ s1.pop());
        System.out.println("peek element is: "+ s1.peek());
        System.out.println("size of stack is: "+ s1.size());
        System.out.println("empty status(AFTER):"+ s1.IsEmpty());
        s1.show();
    }
}
