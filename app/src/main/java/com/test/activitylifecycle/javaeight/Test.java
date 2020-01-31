package com.test.activitylifecycle.javaeight;

public class Test {
    public static void main(String args[])
    {
        // lambda expression to create the object
        new Thread(()->
        {
            System.out.println("New thread created");
            int a=10;
            int b=20;
            System.out.println(a+b);
        }).start();
    }

}
