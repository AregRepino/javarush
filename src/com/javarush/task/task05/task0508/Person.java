package com.javarush.task.task05.task0508;

public class Person {

    private String name;
    private int age;
    public  char sex;
    public static void main(String[] args) {



    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;

    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public char getSex(){
        return this.sex;
    }

    public void setSex(char sex){
        this.sex = sex;
    }



}





//Создать class Person. У человека должно быть имя String name, возраст int age, пол char sex.
//        Создайте геттеры и сеттеры для всех переменных класса Person.
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	В классе Person должен быть метод public static void main.
//        •	Класс Person должен иметь 3 переменные.
//        •	У класса Person должна быть переменная name с типом String.
//        •	У класса Person должна быть переменная age с типом int.
//        •	У класса Person должна быть переменная sex с типом char.
//        •	У класса Person должен быть сеттер для переменной name.
//        •	У класса Person должен быть геттер для переменной name.
//        •	У класса Person должен быть сеттер для переменной age.
//        •	У класса Person должен быть геттер для переменной age.
//        •	У класса Person должен быть сеттер для переменной sex.
//        •	У класса Person должен быть геттер для переменной sex.