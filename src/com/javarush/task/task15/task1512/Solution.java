package com.javarush.task.task15.task1512;

public class Solution {
    public static void main(String[] args) {
        SiamCat simka = new SiamCat("Simka");
        NakedCat nakedSimka = simka.shave();
    }

    public static class NakedCat {
//        public NakedCat() {
//            super();
//        }
    }

    public static class NormalCat extends NakedCat {
//        public NormalCat() {
//            //super();
//        }

        public NormalCat(String name) {
            System.out.println("My name is " + name);
        }

        public NakedCat shave() {
            return this;
        }
    }

    public static class SiamCat extends NormalCat {
        public SiamCat(String name) {
           super(name);
           // super();
        }
    }
}



//Посмотри, что, связанное с конструкторами, может быть добавлено при компиляции, но в этой программе уже присутствует.
//        Упрости код - удали все конструкторы и вызовы конструкторов супер-классов, которые создаются и добавляются автоматически.
//
//        PS: Взаимосвязь между объектами классов NakedCat и NormalCat, SiamCat - Is-a (наследование): http://en.wikipedia.org/wiki/Is-a
//
//        Требования:
//        •	Класс NormalCat должен быть потомком класса NakedCat.
//        •	Класс SiamCat должен быть потомком класса NormalCat.
//        •	Упрости код класса NakedCat.
//        •	Упрости код класса NormalCat.
