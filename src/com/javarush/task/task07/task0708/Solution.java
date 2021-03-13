package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }
        int max = 0;

        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);

            int l = s.length();

            if (l > max) {
                max = l;
            }

        }
        // петр
        ArrayList<String> maxString = new ArrayList<>();



        for (int i = 0; i < strings.size(); i++) {
            // получить элемент по индексу
            // получить длину этого элемента
            // сравнить длину с максимальным
            // если длина равно максимальному то напичатать его
           String element = strings.get(i);

           int length = element.length();

           if (length == max){

               maxString.add(element);
               System.out.println(element);

           }


        }


    }
}

//
//1. Создай список строк.
//        2. Считай с клавиатуры 5 строк и добавь в список.
//        3. Используя цикл, найди самую длинную строку в списке.
//        4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.
//
//        Требования:
//        •	В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
//•	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
//        •	Программа должна выводить самую длинную строку на экран.
//        •	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.