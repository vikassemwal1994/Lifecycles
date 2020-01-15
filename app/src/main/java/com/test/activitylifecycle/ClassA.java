package com.test.activitylifecycle;

import android.provider.Settings;

public class ClassA {

    static int a = 5;
    int b = 10;

    private static void sum(){

    }

    private void sub(){

    }

    public static void main(String[] args){

        System.out.println("value is first "+a);
        a++;
        System.out.println("value is second"+a);

        ClassA obj = new ClassA();
        obj.a = 10;
        obj.b = 15;
        obj.sub();
        obj.sum();


        System.out.println("value is first "+a);
        a++;



    }
}
