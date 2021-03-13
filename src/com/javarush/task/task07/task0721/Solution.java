package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
           String s = reader.readLine();
           int e = Integer.parseInt(s);
           array[i] = e;
        }

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;


        for (int e : array){
            maximum = Math.max(maximum, e);
            minimum = Math.min(minimum, e);
        }


        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
    }
}

//
//    Создать массив на 20 чисел.
//        Заполнить его числами с клавиатуры.
//        Найти максимальное и минимальное числа в массиве.
//        Вывести на экран максимальное и минимальное числа через пробел.
//
//        Требования:
//        •	Создай массив целых чисел (int[]) на 20 элементов.
//        •	Считай с клавиатуры 20 целых чисел и добавь их в массив.
//        •	Найди и выведи через пробел максимальное и минимальное числа.
//        •	Используй цикл for.