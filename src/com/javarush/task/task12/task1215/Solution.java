package com.javarush.task.task12.task1215;

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        public String getName() {
            return null;
        }

        public Cat getChild() {
            return new Cat();
        }

    }

    public static class Dog extends Pet {
        public String getName() {
            return null;
        }

        public Dog getChild() {
            return new Dog();
        }

    }
}


//    Унаследуй классы Cat и Dog от Pet.
//        Реализуй недостающие методы.
//        Классы Cat и Dog не должны быть абстрактными.
//
//        Требования:
//        •	Класс Pet должен быть абстрактным.
//        •	Класс Dog не должен быть абстрактным.
//        •	Класс Cat не должен быть абстрактным.
//        •	Класс Dog должен реализовать абстрактные методы из класса Pet.
//        •	Класс Cat должен реализовать абстрактные методы из класса Pet.