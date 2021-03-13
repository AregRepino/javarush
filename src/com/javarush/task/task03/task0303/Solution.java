package com.javarush.task.task03.task0303;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double a ;
        double b ;

        a = convertEurToUsd(3, 1.2 );
        b = convertEurToUsd(10,3.2);
        System.out.println(a);
        System.out.println(b);


    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur * course;


    }
}

