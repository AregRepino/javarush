package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));




        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            map.put(city, family );
        }




        String city = reader.readLine();



        String family = map.get(city);

        System.out.println(family);











//        List<String> list = new ArrayList<>();
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) {
//                break;
//            }
//
//            list.add(family);
//        }
//
//
//
//
//        // Read the house number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < list.size()) {
//            String familyName = list.get(houseNumber);
//            System.out.println(familyName);
//        }
    }

}



//Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
//        Новая задача: Программа должна работать не с номерами домов, а с городами:
//
//        Пример ввода:
//        Москва
//        Ивановы
//        Киев
//        Петровы
//        Лондон
//        Абрамовичи
//
//        Лондон
//
//        Пример вывода:
//        Абрамовичи
//
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Программа должна считывать значения с клавиатуры.
//        •	Класс Solution должен содержать один метод.
//        •	Программа должна вывести фамилию семьи по введенному городу.