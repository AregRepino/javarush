package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;


public class Solution {
    public static Set<String> createSet() {

        Set<String> set =  new HashSet<>();

        //напишите тут ваш код



        for (int i = 0; i < 20; i ++){

            set.add("Л" + i);
        }

        return set;

    }

    public static void main(String[] args) {

        createSet();

    }
}

//
//    Создать множество строк (Set<String>), занести в него 20 слов на букву "Л".
//
//        Требования:
//        Не изменяй заголовок метода createSet().
//        Программа не должна выводить текст на экран.
//        Программа не должна считывать значения с клавиатуры.
//        Метод createSet() должен создавать и возвращать множество (реализация HashSet).
//        Множество из метода createSet() должно содержать 20 слов на букву «Л».