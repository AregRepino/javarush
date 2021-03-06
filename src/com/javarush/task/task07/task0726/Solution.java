package com.javarush.task.task07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();


            if (name == null || name.isEmpty()) {
                break;
            }

            String s = reader.readLine();
            int age = Integer.parseInt(s);
            int weight = Integer.parseInt(reader.readLine());
            int taill = Integer.parseInt(reader.readLine());


            Cat cat = new Cat(name, age, weight, taill);
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
//        for (int i = 0; i < CATS.size(); i++) {
//            Cat cat = CATS.get(i);
//            System.out.println(cat);
//        }
        for (Cat cat : CATS) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}

//
//Задача: Программа вводит с клавиатуры данные про котов и выводит их на экран.
//
//        Пример:
//        Cat's name: Barsik, age: 6, weight: 5, tail: 22
//        Cat's name: Murka, age: 8, weight: 7, tail: 20
//
//        Требования:
//        •	Программа должна считывать данные с клавиатуры.
//        •	Если пользователь ввел пустую строку вместо имени, то программа должна вывести данные на экран и завершиться.
//        •	Если пользователь ввел: Barsik, 6, 5 и 22 (каждое значение с новой строки), то программа должна вывести "Cat's name: Barsik, age: 6, weight: 5, tail: 22".
//        •	Если пользователь ввел: Murka, 8, 7 и 20 (каждое значение с новой строки), то программа должна вывести "Cat's name: Murka, age: 8, weight: 7, tail: 20".
//        •	Если пользователь ввел: Barsik, 6, 5, 22, Murka, 8, 7 и 20 (каждое значение с новой строки), то программа должна вывести две строки: "Cat's name: Barsik, age: 6, weight: 5, tail: 22" и "Cat's name: Murka, age: 8, weight: 7, tail: 20".