package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            list.add(s);
        }

        list.remove(3);


        for (int i = list.size() - 1; i  >= 0; i--) {
            System.out.println(list.get(i));
        }


    }
}

//
//    Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
//
//        Требования:
//        •	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
//        •	Считай 5 строк с клавиатуры и добавь их в список.
//        •	Удали третий элемент списка.
//        •	Выведи элементы на экран, каждый с новой строки.
//        •	Порядок вывода должен быть обратный.