package com.javarush.task.task07.task0728;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {



        //напишите тут ваш код
       // Collections.sort();
       // Arrays.sort(array, Collections.reverseOrder());
        Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++){
            int t = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = t;
        }
    }


}

//
//Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
//
//        Требования:
//        •	Программа должна считывать 20 целых чисел с клавиатуры.
//        •	Программа должна выводить 20 чисел.
//        •	В классе Solution должен быть метод public static void sort(int[] array).
//        •	Метод main должен вызывать метод sort.
//        •	Метод sort должен сортировать переданный массив по убыванию.