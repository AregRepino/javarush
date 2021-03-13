package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {


            for (int i = 0; i == 0;) {

                String s = reader.readLine();

                int a = Integer.parseInt(s);
                list.add(a);
            }

// написать метод для вывода листа и использовать его в кейч
        } catch (Exception e) {

            for (Integer i: list) {
                System.out.println(i);
            }




        }


    }
}

//
//    Написать программу, которая будет вводить числа с клавиатуры.
//        Код по чтению чисел с клавиатуры должен быть в методе readData.
//        Код внутри readData обернуть в try..catch.
//        Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
//        Числа выводить с новой строки сохраняя порядок ввода.
//
//        Требования:
//        •	Программа должна считывать данные с клавиатуры.
//        •	Метод main не изменять.
//        •	Метод main не должен кидать исключений.
//        •	Метод readData должен содержать блок try..catch.
//        •	Если пользователь ввел текст, а не число, программа должна вывести все ранее введенные числа.