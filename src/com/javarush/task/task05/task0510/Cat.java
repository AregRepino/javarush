package com.javarush.task.task05.task0510;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;


    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.initialize("vasa");

        Cat cat1 = new Cat();
        cat1.initialize("vasa", 10, 5);

        Cat cat2 = new Cat();
        cat2.initialize("vava", 5);

        Cat cat3 = new Cat();
        cat3.initialize(10, "red");

        Cat cat4 = new Cat();
        cat4.initialize(10, "red", "repino");


    }

    public void initialize (String name){
        this.name = name;
        this.age = 5;
        this.weight =10;
        this.color = "red";
    }

    public void initialize (String name, int weight, int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "red";
    }

    public void initialize (String name, int age){
        this.name = name;
        this.age = age;
        this.color = "red";
        this.weight = 10;
    }

    public void initialize (int weight, String color){
        this.weight = weight;
        this.color = color;
        this.age = 5;
    }

    public void initialize (int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 5;
    }

}


//    Создать класс Cat (кот) с пятью инициализаторами:
//        - Имя,
//        - Имя, вес, возраст
//        - Имя, возраст (вес стандартный)
//        - вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
//        - вес, цвет, адрес (чужой домашний кот)
//
//        Задача инициализатора - сделать объект валидным.
//        Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
//        Кот не может ничего не весить.
//        То же касается возраста и цвета.
//        А вот имени может и не быть (null).
//        То же касается адреса: null.
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	У класса Cat должна быть переменная name с типом String.
//        •	У класса Cat должна быть переменная age с типом int.
//        •	У класса Cat должна быть переменная weight с типом int.
//        •	У класса Cat должна быть переменная address с типом String.
//        •	У класса Cat должна быть переменная color с типом String.
//        •	У класса должен быть метод initialize, принимающий в качестве параметра имя, но инициализирующий все переменные класса, кроме адреса.
//        •	У класса должен быть метод initialize, принимающий в качестве параметров имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
//        •	У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий все переменные класса, кроме адреса.
//        •	У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
//        •	У класса должен быть метод initialize, принимающий в качестве параметров вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.