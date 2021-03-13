package com.javarush.task.task13.task1323;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {
        public void onSelect() {

        }
        public void refresh() {

        }

    }
}


//    Реализовать интерфейс Updatable в классе Screen.
//
//        Требования:
//        •	Интерфейс Updatable должен наследовать(extends) интерфейс Selectable.
//        •	Класс Screen должен реализовывать(implements) интерфейс Updatable.
//        •	В классе Screen должен быть реализован метод onSelect интерфейса Selectable.
//        •	В классе Screen должен быть реализован метод refresh интерфейса Updatable.
