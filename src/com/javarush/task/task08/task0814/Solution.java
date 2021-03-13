package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;


public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {

            set.add(i);

        }
        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {



        set.removeIf(x -> x > 10);


        return set;





//        for (Integer x : set) {
//            if (x > 10) {
//                set.remove(x);
//            }
//        }
//
//        return set;





//        Set<Integer> result = new HashSet<>();
//
//        for (Integer x : set) {
//            if (x <= 10) {
//                result.add(x);
//            }
//        }
//
//        return result;

    }

    public static void main(String[] args) {
        Set<Integer> set = createSet();
        set = removeAllNumbersGreaterThan10(set);


    }
}


//    Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
//        Удалить из множества все числа больше 10.
//
//        Требования:
//        •	Программа не должна выводить текст на экран.
//        •	Программа не должна считывать значения с клавиатуры.
//        •	Класс Solution должен содержать только три метода.
//        •	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
//        •	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
