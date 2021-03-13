package com.javarush.task.task12.task1211;

public class Solution {
    public static void main(String[] args) {

       // Pet pet = new Pet(); - нельзя создовать объект абстрактного класса

    }

    public abstract static class Pet {
        public abstract String walk();
        public String getName() {
            return "домашнее животное";
        }
    }
}

//    Сделать класс Pet абстрактным.
//
//        Требования:
//        •	Программа не должна выводить текст на экран.
//        •	Класс Pet должен быть статическим.
//        •	Класс Pet должен быть абстрактным.
//        •	Класс Pet должен иметь один метод getName().