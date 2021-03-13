package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        int[] listA = new int[10];
        int[] listB = new int[10];

        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < listA.length; i++) {
            listA[i] = list[i];
        }

        for (int i = 0; i < listA.length; i++) {
            listB[i] = list[i + list.length / 2];
        }


        for (int i = 0; i < listB.length; i++) {
            System.out.println(listB[i]);
        }

        // цикл  сначало до половины
        for (int i = 0; i < list.length / 2; i++) {
            listA[i] = list[i];


        }

        // цикл с половины до конца
        int a = list.length / 2;
        for (int i = list.length / 2; i < list.length; i++) {
            listB[i - a] = list[i];

        }


    }
}


//
//1. Создать массив на 20 чисел.
//        2. Ввести в него значения с клавиатуры.
//        3. Создать два массива на 10 чисел каждый.
//        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
//
//        Требования:
//        •	Программа должна создавать большой массив на 20 целых чисел.
//        •	Программа должна считывать с клавиатуры 20 чисел для большого массива.
//        •	Программа должна создавать два маленьких массива на 10 чисел каждый.
//        •	Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран.