package com.javarush.task.task05.task0511;

public class Dog {
    private String name;
    private int height;
    private String color;

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.initialize("richi");

        Dog dog1 = new Dog();
        dog1.initialize("richi", 20);

        Dog dog2 = new Dog();
        dog2.initialize("richi", 20, "whit");

    }

    public void initialize (String name){
        this.name = name;

    }

    public void initialize (String name, int height){
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color){
        this.name = name;
        this.height = height;
        this.color = color;
    }

}

//    Создать класс Dog (собака) с тремя инициализаторами:
//        - Имя
//        - Имя, рост
//        - Имя, рост, цвет
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	У класса Dog должна быть переменная name с типом String.
//        •	У класса Dog должна быть переменная height с типом int.
//        •	У класса Dog должна быть переменная color с типом String.
//        •	У класса должен быть метод initialize, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
//        •	У класса должен быть метод initialize, принимающий в качестве параметров имя, рост и инициализирующий соответствующие переменные класса.
//        •	У класса должен быть метод initialize, принимающий в качестве параметров имя, рост, цвет и инициализирующий соответствующие переменные класса.