package com.javarush.task.task09.task0905;

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
        //System.out.println(deep);
    }


    public static int getStackTraceDepth() {
        //напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        int deep = elements.length;
        System.out.println(deep);
        return deep;

    }
}

//
//    Написать метод, который возвращает результат - глубину его стек-трейса - количество методов в нем (количество элементов в списке).
//        Это же число метод должен выводить на экран.
//
//        Требования:
//        •	Метод getStackTraceDepth должен возвращать глубину своего стек-трейса.
//        •	Метод getStackTraceDepth должен выводить на экран глубину своего стек-трейса.
//        •	Воспользуйся методом Thread.currentThread().getStackTrace().
//        •	Метод main должен вызывать метод getStackTraceDepth.