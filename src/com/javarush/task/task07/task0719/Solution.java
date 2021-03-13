package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();

            int e = Integer.parseInt(s);
            list.add(e);

        }


        for (int i = list.size() - 1; i >= 0; i--)  {
            int e = list.get(i);

            System.out.println(e);

        }
    }
}

//
//    Ввести с клавиатуры 10 чисел и заполнить ими список.
//        Вывести их в обратном порядке. Каждый элемент - с новой строки.
//        Использовать только цикл for.
//
//        Подсказка:
//        Не забудь импортировать класс: java.util.ArrayList;
//
//        Требования:
//        •	Объяви переменную типа список целых чисел и сразу проинициализируй ee.
//        •	Считай 10 целых чисел с клавиатуры и добавь их в список.
//        •	Выведи числа в обратном порядке.
//        •	Используй цикл for.