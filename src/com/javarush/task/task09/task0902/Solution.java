package com.javarush.task.task09.task0902;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement [] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();

        //напишите тут ваш код
    }

    public static String method2() {
        method3();
        StackTraceElement [] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method3() {
        method4();
        StackTraceElement [] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method4() {
        method5();
        StackTraceElement [] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
        //напишите тут ваш код
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement [] elements = Thread.currentThread().getStackTrace();
        return elements[2].getMethodName();
    }
}

//
//    Написать пять методов, которые вызывают друг друга.
//        Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
//
//        Требования:
//        •	В классе должно быть 5 методов (метод main не учитывать).
//        •	Каждый метод должен вызывать следующий: main вызывать method1, method1 вызывать method2 и т.д.
//        •	Каждый метод должен возвращать имя метода, вызвавшего его.
//        •	Для получения имени вызвавшего метода, используй метод getMethodName.