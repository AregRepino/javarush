package com.javarush.task.task12.task1218;

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat {
        public void move() {
            System.out.println("собака - передвигаеться");

        }

        public void eat() {

        }
    }

    public class Duck implements CanMove, CanFly, CanEat {
        public void move() {
            System.out.println("Утка - передвигаеться");

        }

        public void fly() {

        }

        public void eat() {

        }
    }

    public class Car implements CanMove {
        public void move() {

        }

    }

    public class Airplane implements CanMove, CanFly {
        public void move() {

        }

        public void fly() {
        }
    }
}

//
//Есть public интерфейсы CanFly(летать), CanMove(передвигаться), CanEat(есть).
//        Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
//
//        Требования:
//        Класс Solution должен содержать интерфейс CanFly с одним методом fly().
//        Класс Solution должен содержать интерфейс CanMove с одним методом move().
//        Класс Solution должен содержать интерфейс CanEat с одним методом eat().
//        Собака должна уметь передвигаться и есть.
//        Автомобиль должен уметь передвигаться.
//        Самолет должен уметь передвигаться и летать.
//        Утка должна уметь передвигаться, летать и есть.