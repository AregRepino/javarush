package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        // считывание с консоли
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

// ArrayList<Integer> - массив страки array - переменная
// = - пресвоение  new - создание нового обекта  ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        array.add(a);
        array.add(b);
        array.add(c);
        array.add(d);
        array.add(e);
//  коллекций сортировка
        Collections.sort(array);

        for (int i = 0; i < array.size(); i++) {
            Integer element = array.get(i);
            System.out.println(element);
        }


        for (Integer element : array) {
            System.out.println(element);

        }


        //напишите тут ваш код
    }
}
