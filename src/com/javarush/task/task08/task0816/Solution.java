package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне1", dateFormat.parse("JANUARY 1 2012"));
        map.put("Сталлоне2", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Сталлоне3", dateFormat.parse("MARCH 1 2012"));
        map.put("Сталлоне4", dateFormat.parse("APRIL 1 2012"));
        map.put("Сталлоне5", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлоне6", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталлоне7", dateFormat.parse("JULY 1 2012"));
        map.put("Сталлоне8", dateFormat.parse("AUGUST 1 2012"));
        map.put("Сталлоне9", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Сталлоне10", dateFormat.parse("OCTOBER 1 2012"));

        //напишите тут ваш код

        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
//        for (String key : map.keySet()){
//            Date date = map.get(key);
//            int month = date.getMonth();
//            if (month == 5 || month == 6 || month == 7) {
//                map.remove(key);
//            }
//        }
//
//
    //    map.values().removeIf(date -> date.getMonth() == 5 || date.getMonth() == 6 || date.getMonth() == 7);

        List<String> list = new ArrayList<>();

        for (String key : map.keySet()){
            Date date = map.get(key);
            int month = date.getMonth();
            if (month == 5 || month == 6 || month == 7) {
                list.add(key);
            }
        }

        for (String key : list) {
            map.remove(key);

        }


    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);

    }
}

//
//    Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
//        Удалить из словаря всех людей, родившихся летом.
//
//        Требования:
//        Программа не должна выводить текст на экран.
//        Программа не должна считывать значения с клавиатуры.
//        Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
//        Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.