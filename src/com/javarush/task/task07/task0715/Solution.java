package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        List<String> list = new ArrayList<>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

        String s = "именно";


        list.add(1, s);
        list.add(3, s);
        // мама именно мыла имено  раму именно
        // 0     1       2    3     4      5
        list.add(s);

        for (String element : list){

           System.out.println(element);
        }


      //  List<String> arrayList = Arrays.asList("мама", s, "мыла", s, "раму", s);


    }
}


//1. Создай список из слов "мама", "мыла", "раму".
//        2. После каждого слова вставь в список строку, содержащую слово "именно".
//        3. Вывести результат на экран, каждый элемент списка с новой строки.
//
//        Требования:
//        Программа не должна считывать данные с клавиатуры.
//        Объяви переменную типа список строк и сразу проинициализируй ee.
//        Добавь в список слова: «мама», «мыла», «раму».
//        После каждого слова добавь в список строку, содержащую слово «именно».
//        Выведи элементы списка на экран, каждый с новой строки.