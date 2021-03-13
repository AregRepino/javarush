package com.javarush.task.task13.task1315;

public class Solution {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

}


//1. Создай классы Dog, Cat и Mouse.
//        2. Реализуй интерфейсы в добавленных классах, учитывая что:
//        - Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
//        - Мышь(Mouse) может передвигаться и может быть съедена.
//        - Собака(Dog) может передвигаться и съесть кого-то.
//
//        Требования:
//        •	Класс Cat должен быть объявлен внутри класса Solution.
//        •	Класс Dog должен быть объявлен внутри класса Solution.
//        •	Класс Mouse должен быть объявлен внутри класса Solution.
//        •	Кот(Cat) может передвигаться, может кого-то съесть и может быть сам съеден.
//        •	Мышь(Mouse) может передвигаться и может быть съедена.
//        •	Собака(Dog) может передвигаться и съесть кого-то.