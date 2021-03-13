package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);
        map.put("May", 5);
        map.put("June", 6);
        map.put("July", 7);
        map.put("August", 8);
        map.put("September", 9);
        map.put("October", 10);
        map.put("November", 11);
        map.put("December", 12);


        String month = reader.readLine();


        Integer monthNumber =  map.get(month);

        System.out.println(month + " is the " + monthNumber + " month");



//        if (map.containsKey(month)) {
//            System.out.println("May is the " + map.containsValue(month) + " month");
//        }





//        map.containsKey(month);
//        System.out.println("May is the " + map.values() + " month");



    }
}


//    Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
//        Используйте коллекции.
//
//        Требования:
//        •	Программа должна считывать одно значение с клавиатуры.
//        •	Программа должна выводить текст на экран.
//        •	Программа должна использовать коллекции.
//        •	Программа должна считывать с клавиатуры имя месяца и выводить его номер на экран по заданному шаблону.