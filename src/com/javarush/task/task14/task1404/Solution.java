package com.javarush.task.task14.task1404;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String s = reader.readLine();
            if (s.equals("")) {
                break;
            }
            CatFactory catFactory = new CatFactory();
            Cat cat = catFactory.getCatByKey(s);
            System.out.println(cat.toString());
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}



//1. Считывать строки(параметры) с консоли, пока пользователь не введет пустую строку(Enter).
//        2. Каждый параметр соответствует имени кота.
//
//        Для каждого параметра:
//        3. Создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
//        4. Вывести на экран cat.toString().
//
//        Требования:
//        •	Программа должна считывать данные с клавиатуры.
//        •	Программа должна прекращать считывать данные после ввода пустой строки.
//        •	Программа должна выводить на экран описание каждого кота (cat.toString).
//        •	Программа должна создавать объект класса Cat для каждого введенного имени кота(строки считанной с клавиатуры) c помощью метода getCatByKey.