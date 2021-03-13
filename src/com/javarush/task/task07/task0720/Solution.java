package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();


        String s = reader.readLine();
        int N = Integer.parseInt(s);
        s = reader.readLine();
        int M = Integer.parseInt(s);

        for (int i = 0; i < N; i++) {
            String e = reader.readLine();
            list.add(e);
        }

        for (int i = 0; i < M; i++) {
            String e = list.remove(0);
            list.add(e);

        }


        for (String e : list) {
            System.out.println(e);
        }


    }

}
//
//    Ввести с клавиатуры 2 числа N и M.
//    Ввести N строк и заполнить ими список.
//    Переставить M первых строк в конец списка.
//    Вывести список на экран, каждое значение с новой строки.
//
//    Примечание: запрещено создавать больше одного списка.
//
//            Требования:
//            •	Объяви переменную типа список строк и сразу проинициализируй ee.
//•	Считай c клавиатуры числа N и M, считай N строк и добавь их в список.
//            •	Переставить M первых строк в конец списка.
//•	Выведи список на экран, каждое значение с новой строки.