package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код


        int temp = 0;
        for (int i = 0; i < array.length; i++) {
// для уменшение операции сортировки нужно из array.length - 1 вычитать i что бы не доходить до конца так как в конце уже отсортировыный элементы
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }


            }
        }







// сортировка по возростанию
        // Arrays.sort(array);

    }


    public static void sort2 (int [] array) {

        // 1 2 3 4 5 6
        // отсортировать по возростанию


// j = 3 > j + 1 = 2

        int temp = 0;

        for (int i = 0; i < array.length; i ++) {

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;

                }
            }
        }

    }

    // 32 20 1 33 58 4 9 40 32 103
    // 7 2
    public static  void swap (int [] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

}


//    Создать массив на 20 чисел.
//        Заполнить его числами с клавиатуры.
//        Вывести пять наибольших чисел.
//        Каждое значение с новой строки.
//
//        Требования:
//        •	Программа должна выводить числа на экран.
//        •	Программа должна считывать значения с клавиатуры.
//        •	Класс Solution должен содержать два метода.
//        •	Метод sort() должен сортировать массив чисел от большего к меньшему.
//        •	Метод main() должен вызывать метод sort().
//        •	Программа должна выводить пять наибольших чисел массива. Каждое значение с новой строки.