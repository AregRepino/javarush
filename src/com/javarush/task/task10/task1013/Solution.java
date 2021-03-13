package com.javarush.task.task10.task1013;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private int age;
        private int weight;
        private String car;
        private String address;


        public Human(String name) {
            this.name = name;


        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int age) {
            this.name = name;
            this.surname = surname;
            this.age = age;


        }

        public Human(String name, String surname, int age, int weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.weight = weight;

        }

        public Human(String name, String surname, int age, int weight, String car) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.weight = weight;
            this.car = car;


        }

        public Human(String name, String surname, int age, String address, int weight, String car) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.weight = weight;
            this.car = car;
            this.address = address;
        }

        public Human(String surname, int age) {
            this.surname = surname;
            this.age = age;
        }

        public Human(String surname, int age, String address) {
            this.surname = surname;
            this.age = age;
            this.address = address;

        }

        public Human(String surname, int age, String address, String car) {
            this.surname = surname;
            this.age = age;
            this.address = address;
            this.car = car;


        }

        public Human(String surname, int age, String address, String car, int weight) {
            this.surname = surname;
            this.age = age;
            this.address = address;
            this.car = car;
            this.weight = weight;

        }


    }

}

//
//    Напиши класс Human с 6 полями.
//        Придумай и реализуй 10 различных конструкторов для него.
//        Каждый конструктор должен иметь смысл.
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	В классе Human должно быть 6 полей.
//        •	Все поля класса Human должны быть private.
//        •	В классе Human должно быть 10 конструкторов.
//        •	Все конструкторы класса Human должны быть public.