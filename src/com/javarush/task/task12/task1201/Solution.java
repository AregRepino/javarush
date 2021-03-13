package com.javarush.task.task12.task1201;

public class Solution extends Object {

    public static void main(String[] args) {
        Cow cow = new Whale();
        Cow cowA = new Fish();
        Cow cowB = new Cow();
        Cow cowC = new Dog();

        System.out.println(cow.getName());
        System.out.println(cowA.getName());
        System.out.println(cowB.getName());
        System.out.println(cowC.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        public String getName() {
            return "Я не корова, Я - кит.";
        }

    }

    public static class Fish extends Cow {
        public String getName() {
            return "Я не корова, Я - рыба.";
        }

    }


    public static class Dog extends Whale {
        public String getName() {
            return "Я не корова, Я - dog";
        }

    }




}

//    Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
//
//        Я не корова, Я - кит.
//
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Класс Whale должен наследоваться от класса Cow.
//        •	Класс Whale должен переопределять метод getName().
//        •	Метод main() должен вызывать метод getName() у объекта cow.
//        •	Переопределить метод getName в классе Whale(Кит), чтобы программа выводила на экран: "Я не корова, Я - кит."
//        •	Метод main() должен выводить на экран результат вызова метода getName().
