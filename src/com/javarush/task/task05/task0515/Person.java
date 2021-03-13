package com.javarush.task.task05.task0515;

public class Person {
    private String name;
    private char sex;
    private int money;
    private int weight;
    private double size;

    public static void main(String[] args) {
        Person person = new Person();
        person.initialize("areg", 10000000, 'm', 86, 35.6);

    }

    public void initialize(String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }
}

//    Изучи внимательно класс Person.
//        Исправь класс так, чтобы только один метод initialize инициализировал все переменные класса Person.
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	У класса Person должно быть 5 переменных.
//        •	У класса должен быть один метод initialize.
//        •	Метод initialize должен иметь пять параметров.