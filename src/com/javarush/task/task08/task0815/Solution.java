package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Фуд", "Арег");
        map.put("Фуд", "Алиса");
        map.put("Медведев", "Дима");
        map.put("Непомнещий", "Дима");
        map.put("Непомнещий", "Арагац");
        map.put("Шумарин", "Никита");
        map.put("Помедин", "Саша");
        map.put("Помедин", "Алина");
        map.put("Зыков", "Филип");
        map.put("Зe", "Алина");
        map.put("Зыковr", "Алина");
        map.put("Зыковs", "Алина");
        map.put("Зыковl", "Алина");


        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код

        int countName = 0;

        for (String s : map.values()) {

            if (s.equals(name)) {
                countName++;
            }

        }


        return countName;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int countLastName = 0;

        for (String s : map.keySet()) {

            if (s.equals(lastName)) {
                countLastName ++;
            }
        }

        return countLastName;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
       int countLast = getCountTheSameLastName(map, "Фуд");
       System.out.println(countLast);

       int countName = getCountTheSameFirstName(map, "Алина");
       System.out.println(countName);



    }
}

//
//    Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
//        Проверить сколько людей имеют совпадающие с заданным именем или фамилией.
//
//        Требования:
//        •	Программа не должна выводить текст на экран.
//        •	Программа не должна считывать значения с клавиатуры.
//        •	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
//        •	Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
//        •	Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.