package StackPackage;

public class StackRunner
{
    // create array first
    int Stack[]= new int[5];

    int top=0;

        // ************ Push() ****************
    public  void  push(int data)
    {
        if(top==5)
        {
            System.out.println("Stack is full...");
        }
        else
        {
            Stack[top] = data;
            top++;
        }
    }

    // ************ Pop() ****************
    public int pop()
    {
        int data=0;
        if(IsEmpty())
        {
            System.out.println("Stack is empty...");
        }
        else
        {

            top--;
            data = Stack[top];

            Stack[top] = 0;
        }
        return data;
    }

    // ************ peek() ****************
    public  int peek()
    {
        int data;

        data=Stack[top-1];

        return  data;
    }

    // ************ Size() ****************
    public  int size()
    {
        return  top;
    }
    // ************ IsEmpty() ****************
    public  boolean IsEmpty()
    {
        return  top<=0;
    }

    public void show()
    {
        for(int nums: Stack)
        {
            System.out.print(nums+ " ");
        }
    }
}
