package com.javarush.task.task13.task1304;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public static class Screen implements Selectable, Updatable {
        public void onSelect() {

        }
        public void refresh() {

        }
    }
}


//    Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable.
//        Не забудь реализовать методы!
//
//        Требования:
//        •	Класс Screen должен реализовывать(implements) интерфейс Selectable.
//        •	Класс Screen должен реализовывать(implements) интерфейс Updatable.
//        •	В классе Screen должен быть реализованы методы интерфейса Selectable.
//        •	В классе Screen должен быть реализованы методы интерфейса Updatable.
