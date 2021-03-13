package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Фуд",  300);
        map.put("Медведев", 600);
        map.put("Непомнещий", 357);
        map.put("Шумарин", 200);
        map.put("Помедин", 300);
        map.put("Помеди", 1000);
        map.put("Зыков", 800);
        map.put("Зe", 700);
        map.put("Зыковr", 400);
        map.put("Зыковs", 708);


        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код

        //map.values().removeIf(value -> value < 500);

        Map<String, Integer> copy = new HashMap<>(map);


        for (String key : copy.keySet()){
            Integer value = copy.get(key);
            if (value < 500){
                map.remove(key);
            }

        }
    }

    public static void main(String[] args) {

        Map<String, Integer> map = createMap();
        removeItemFromMap(map);


    }
}

//
//    Создать словарь (Map<String, Integer>) и занести в него десять записей по принципу: "фамилия" - "зарплата".
//        Удалить из словаря всех людей, у которых зарплата ниже 500.
//
//        Требования:
//        •	Программа не должна выводить текст на экран.
//        •	Программа не должна считывать значения с клавиатуры.
//        •	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, Integer состоящих из 10 записей по принципу «фамилия» - «зарплата».
//        •	Метод removeItemFromMap() должен удалять из словаря всех людей, у которых зарплата ниже 500.