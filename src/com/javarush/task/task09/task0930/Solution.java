package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        String variable = null;
        for (int j = 0; j < array.length; j ++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (isGreaterThan(array[i], array[i + 1])) {
                    variable = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = variable;
                }
            }
        }

    }


    public static void sortString(String[] array) {
        // напишите тут ваш код
        String variable = null;
        for (int j = 0; j < array.length; j ++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (isGreaterThan(array[i], array[i + 1])) {
                    variable = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = variable;
                }
            }
        }



    }

    public static void sort(int[] array) {
        int variable = 0;
        for (int i = 0; i <  array.length; i ++) {
            for (int j = 0; j < array.length -1 - i; j ++ ) {
                if (array[j] < array[j + 1]) {
                    variable = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = variable;

                }

            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}


//Задача: Пользователь вводит с клавиатуры список слов (и чисел).
//        Слова вывести в возрастающем порядке, числа - в убывающем.
//
//        Пример ввода:
//        Вишня
//        1
//        Боб
//        3
//        Яблоко
//        22
//        0
//        Арбуз
//
//        Пример вывода:
//        Арбуз
//        22
//        Боб
//        3
//        Вишня
//        1
//        0
//        Яблоко
//
//        Требования:
//        •	Программа должна считывать данные с клавиатуры.
//        •	Программа должна выводить данные на экран.
//        •	Выведенные слова должны быть упорядочены по возрастанию (используй готовый метод isGreaterThan).
//        •	Выведенные числа должны быть упорядочены по убыванию.
//        •	Метод main должен использовать метод sort.
//        •	Метод sort должен использовать метод isGreaterThan.
//        •	Метод sort должен использовать метод isNumber.