package com.javarush.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(Date.parse(date)));

        return cal.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}


//1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
//        2. String date передается в формате FEBRUARY 1 2013
//        Не забудьте учесть первый день года.
//
//        Пример:
//        JANUARY 1 2000 = true
//        JANUARY 2 2020 = false
//
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Класс Solution должен содержать два метода.
//        •	Метод isDateOdd() должен возвращать true, если количество дней с начала года - нечетное число, иначе false.
//        •	Метод main() должен вызывать метод isDateOdd().