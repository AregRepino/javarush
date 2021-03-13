package com.javarush.task.task09.task0906;

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement [] elements = Thread.currentThread().getStackTrace();
        StackTraceElement element = elements[2];
        String methodName = element.getMethodName();
        String className = element.getClassName();
        int numberLine = element.getLineNumber();
        // имя класс имя метода номер линии вызово сообщение

        System.out.println(className + ": " + methodName + ": " + numberLine + ": " + s);
    }
}


//    Реализовать метод log.
//        Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
//        Имя класса, имя метода и сообщение разделить двоеточием с пробелом.
//
//        Пример вывода:
//        com.javarush.task.task09.task0906.Solution: main: In main method
//
//        Требования:
//        •	Метод log должен выводить сообщение на экран.
//        •	Выведенное сообщение должно содержать имя класса, метод которого вызвал метод log.
//        •	Выведенное сообщение должно содержать имя метода, который вызвал метод log.
//        •	Выведенное сообщение должно содержать переданное сообщение.
//        •	Вывод должен соответствовать примеру из задания.