package com.javarush.task.task05.task0509;

public class Friend {
    private String name;
    private int age;
    private char sex;

    public static void main(String[] args) {

        Friend friend = new Friend();
        Friend friend1 = new Friend("друзья");
        Friend friend2 = new Friend("друзья", 30);
        Friend friend3 = new Friend("дру", 20, 'm');

        Friend friend4 = new Friend();
        friend4.initialize("areg");

        Friend friend5 =new Friend();
        friend5.initialize("dog", 30);

        Friend friend6 = new Friend();
        friend6.initialize("yes", 40, 'm');

    }
    public Friend (){

    }

    public Friend (String name){
        this.name = name;

    }

    public Friend (String name, int age){
        this.name = name;
        this.age = age;
    }

    public Friend (String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void initialize (String name){
        this.name = name;
    }

    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
    }

    public void initialize (String name, int age, char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}

//
//    Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
//        - Имя
//        - Имя, возраст
//        - Имя, возраст, пол
//
//        Примечание:
//        Имя(String), возраст(int), пол(char).
//
//        Требования:
//        •	У класса Friend должна быть переменная name с типом String.
//        •	У класса Friend должна быть переменная age с типом int.
//        •	У класса Friend должна быть переменная sex с типом char.
//        •	У класса должен быть метод initialize, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
//        •	У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий соответствующие переменные класса.
//        •	У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст, пол и инициализирующий соответствующие переменные класса.