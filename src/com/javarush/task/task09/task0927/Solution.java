package com.javarush.task.task09.task0927;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("barsik", new Cat("barsik"));
        map.put("bar", new Cat("bar"));
        map.put("pen", new Cat("pen"));
        map.put("archi", new Cat("archi"));
        map.put("vos", new Cat("vos"));
        map.put("good", new Cat("good"));
        map.put("food", new Cat("food"));
        map.put("nam", new Cat("nam"));
        map.put("rr", new Cat("rr"));
        map.put("gaph", new Cat("gaph"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Collection<Cat> cats = map.values();


        Set<Cat> set = new HashSet<>(cats);
        return  set;

        //return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}


//    Есть класс кот - Cat, с полем "имя" (String).
//    Создать словарь Map<String, Cat> и добавить туда 10 котов в виде "Имя"-"Кот".
//    Получить из Map множество(Set) всех котов и вывести его на экран.
//
//    Требования:
//            •	Программа не должна считывать данные с клавиатуры.
//•	Метод createMap должен создавать новый объект HashMap<String, Cat>.
//•	Метод createMap должен добавлять в словарь 10 котов в виде «Имя»-«Кот».
//            •	Метод createMap должен возвращать созданный словарь.
//            •	Метод convertMapToSet должен создать и вернуть множество котов, полученных из переданного словаря.
//•	Программа должна вывести всех котов из множества на экран.