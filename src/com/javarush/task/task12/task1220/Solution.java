package com.javarush.task.task12.task1220;

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public abstract class Human implements CanRun, CanSwim {

//        @Override
//        public void run() {
//
//        }

        @Override
        public void swim() {

        }
    }


}


//Напиши public класс Human(человек) и public интерфейсы CanRun(бежать/ездить), CanSwim(плавать).
//        Добавь в каждый интерфейс по oдному методу.
//        Добавь эти интерфейсы классу Human, но не реализуй методы.
//        Объяви класс Human абстрактным.
//
//        Требования:
//        •	Класс Solution должен содержать интерфейс CanRun с одним методом.
//        •	Класс Solution должен содержать интерфейс CanSwim с одним методом.
//        •	Класс Solution должен содержать класс Human.
//        •	Класс Human должен реализовывать интерфейсы CanRun и CanSwim.
//        •	Класс Human должен быть абстрактным.
//        •	Класс Human не должен иметь методов.