package com.javarush.task.task14.task1421;

public class Solution {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getHi());
        System.out.println(singleton);




        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getHi());
        System.out.println(singleton1);


        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2.getHi());
        System.out.println(singleton2);

    }


}
