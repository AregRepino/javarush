package javaStrackTrace;

public class Solution {

    public static void main(String [] args) {
        methodA();
    }


    public static void methodA() {
        methodB();
    }


    public static void methodB() {
        methodC();
       // methodD();

    }

    public static void methodC() {
        methodD();

    }

    public static void methodD() {

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements) {
            System.out.println(element.getMethodName());
        }


    }



}
