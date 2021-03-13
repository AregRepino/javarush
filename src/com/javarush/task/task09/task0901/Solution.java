package com.javarush.task.task09.task0901;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        StackTraceElement [] stackTraceElement = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElement[2].getMethodName());

        return stackTraceElement;

        //напишите тут ваш код
    }

    public static StackTraceElement[] method2() {
        method3();
        StackTraceElement [] stackTraceElement = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElement[2].getMethodName());
        return stackTraceElement;

        //напишите тут ваш код
    }

    public static StackTraceElement[] method3() {
        method4();
        StackTraceElement [] stackTraceElement = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElement[2].getMethodName());
        return stackTraceElement;

        //напишите тут ваш код

    }

    public static StackTraceElement[] method4() {

        method5();
        StackTraceElement [] stackTraceElement = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElement[2].getMethodName());
        return stackTraceElement;

    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement [] stackTraceElement = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElement[2].getMethodName());
        return stackTraceElement;


    }
}


//    Написать пять методов, которые вызывают друг друга.
//        Каждый метод должен возвращать свой StackTrace.
//
//        Требования:
//        •	В классе должно быть 5 методов (метод main не учитывать).
//        •	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
//        •	Каждый метод должен возвращать свой StackTrace.
//        •	Для получения StackTrace воспользуйся Thread.currentThread().getStackTrace().