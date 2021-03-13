package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];


        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);

        }

        int sumRights = 0;

        for (int i = 0; i < list.length; i = i + 2) {
            sumRights = sumRights + list[i];


        }

        int sumLeft = 0;


        for (int i = 1; i < list.length; i = i + 2) {

            sumLeft = sumLeft + list[i];

        }

        if (sumRights > sumLeft) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

        sumRights = 0;
        sumLeft = 0;


        for (int i = 0; i < list.length; i++) {
            if (i % 2 == 0) {
                sumRights = sumRights + list[i];
            } else {
                sumLeft = sumLeft + list[i];
            }

        }


    }
}


//1. Создать массив на 15 целых чисел.
//        2. Ввести в него значения с клавиатуры.
//        3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
//        Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой. Выяснить, на какой стороне улицы проживает больше жителей.
//        4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или "В домах с четными номерами проживает больше жителей."
//
//        Примечание:
//        дом с порядковым номером 0 считать четным.
//
//        Требования:
//        •	Программа должна создавать массив на 15 целых чисел.
//        •	Программа должна считывать числа для массива с клавиатуры.
//        •	Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.", если сумма нечетных элементов массива больше суммы четных.
//        •	Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.", если сумма четных элементов массива больше суммы нечетных.