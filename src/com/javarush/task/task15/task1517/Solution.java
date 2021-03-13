package com.javarush.task.task15.task1517;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int A = 0;


    static {

        List<Integer>  list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(2);



        list.get(5);



        //RuntimeException exception = new RuntimeException();


          //int i = 5 / 0;





        //throw an exception here - выбросьте эксепшн тут
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}

//    В статическом блоке выбросьте Exception
//        В результате класс не загрузится, и вы увидите сообщение об ошибке вместо значения переменной B
//
//        Exception in thread "main" java.lang.ExceptionInInitializerError
//        at java.lang.Class.forName0(Native Method)
//        at java.lang.Class.forName(Class.java:186)
//        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:113)
//        Caused by: java.lang.RuntimeException:
//        at com.javarush.task.task15.task1517.Solution.<clinit>(Solution.java:22)
//
//        Hint: Нужно погуглить причину, если получилось следующее:
//        java: initializer must be able to complete normally
//        java: unreachable statement
//
//        Требования:
//        •	В классе Solution в статическом блоке должно возникать исключение (Exception).
//        •	Программа не должна ничего выводить на экран, кроме автоматического сообщения о возникшем исключении.
//        •	Программа не должна считывать данные с клавиатуры.
//        •	Класс Solution должен быть public.
