package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }


        int previousLength = list.get(0).length();
//    0  1  2  3   4   5
//    7 15 20 30  45  44
        for (int i = 1; i < list.size(); i++) {

            String s = list.get(i);

            int length = s.length();

            if (length < previousLength){
                System.out.println(i);

                break;

            }

            previousLength = length;


        }



    }
}


//1. Введи с клавиатуры 10 слов в список строк.
//        2. Определить, является ли список упорядоченным по возрастанию длины строки.
//        3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
//
//        Требования:
//        •	Объяви переменную типа список строк и сразу проинициализируй ee.
//        •	Считай 10 строк с клавиатуры и добавь их в список.
//        •	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
//        •	Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.