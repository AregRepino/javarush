package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут

        int min = array.get(0);
        //int min = Integer.MAX_VALUE;


        for (Integer i : array) {
            if (i < min){
                min = i;
            }

        }



        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int N = Integer.parseInt(s);

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(reader.readLine());
            list.add(number);
        }

        return list;
    }
}

//
//. Ввести с клавиатуры число N.
//        2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
//        3. Найти минимальное число среди элементов списка - метод getMinimum.
//
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Программа должна считывать значения с клавиатуры.
//        •	Класс Solution должен содержать только три метода.
//        •	Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
//        •	Метод getMinimum() должен вернуть минимальное число среди элементов списка.
//        •	Метод main() должен вызывать метод getIntegerList().
//        •	Метод main() должен вызывать метод getMinimum().