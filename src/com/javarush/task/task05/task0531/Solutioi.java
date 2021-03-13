package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solutioi {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int i = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, e, d, i);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int e, int d, int i) {
        //return Math.min(a, b);
        int min = Math.min(a, b);
        min = Math.min(min, e);
        min = Math.min(min, d);
        min = Math.min(min, i);
        return min;


//
       // return Math.min(Math.min(Math.min(Math.min(a, b), e), d), i);
    }
}
//return a < b ? a : b;

//    Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
//        Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
//        Требования:
//        •	Программа должна считывать числа с клавиатуры.
//        •	В классе должен быть метод public static void main.
//        •	В классе должен быть метод public static min, принимающий 5 параметров типа int.
//        •	Метод min должен возвращать минимум из 5 переданных чисел. Если минимальных чисел несколько - вернуть любое из них.
//        •	Программа должна выводить строку, которая начинается на "Minimum = ".
//        •	Программа должна вывод