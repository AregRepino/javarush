package com.javarush.task.task14.task1421;

import com.javarush.task.task09.task0924.Solution;

public class Singleton {

    private static Singleton instance;



 //   initialization
//    static {
//        instance = new Singleton();
//    }



    private Singleton() {

    }

   // lazy
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }


        return instance;
    }



    public  String getHi() {
        return "привет";
    }



}
