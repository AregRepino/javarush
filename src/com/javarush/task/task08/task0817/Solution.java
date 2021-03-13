package com.javarush.task.task08.task0817;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Фуд", "Арег");
        map.put("Медведев", "Дима");
        map.put("Непомнещий", "Дима");
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

        Map<String, Integer> countMap = new HashMap<>();
        //Collection<String> values = map.values();
        for (String value : map.values()){
            Integer count = countMap.get(value);

            if (count == null){
                count = 1;
            } else {
                count = count + 1;
            }

            countMap.put(value, count);
        }

        for (Map.Entry<String, Integer> pair : countMap.entrySet()){
            String key = pair.getKey();
            Integer value = pair.getValue();

            if (value > 1){
                removeItemFromMapByValue(map, key);
            }
        }
        // Арег
        //





        // Арег Дима Дима Алиса Алина Алина Арег
        // Арег 2
        // Дима 2
        // Алиса 1
        // Алина 2



    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);

    }
}
//
//
//    Создать словарь (Map<String, String>) занести в него десять записей по принципу "фамилия" - "имя".
//        Удалить людей, имеющих одинаковые имена.
//
//        Требования:
//        •	Программа не должна выводить текст на экран.
//        •	Программа не должна считывать значения с клавиатуры.
//        •	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
//        •	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
//        •	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().