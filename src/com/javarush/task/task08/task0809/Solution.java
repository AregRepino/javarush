package com.javarush.task.task08.task0809;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getInsertTimeInMs(new ArrayList()));
        System.out.println(getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код

        Date currentTime = new Date();

        insert10000(list);

        Date newTime = new Date();

        long ms = newTime.getTime() - currentTime.getTime();
//        84273
//        126
        // напишите тут ваш код

        return ms;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 1000000; i++) {
            list.add( new Object());
        }




    }

}

//
//Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
//        Метод getInsertTimeInMs должен вернуть время своего исполнения в миллисекундах.
//
//        Требования:
//        •	Программа должна выводить числа на экран.
//        •	Метод main должен вызывать метод getInsertTimeInMs только два раза.
//        •	Метод insert10000(List list) должен вставлять 10 тысяч элементов в список.
//        •	Метод getInsertTimeInMs должен вызывать метод insert10000 только один раз.
