package com.javarush.task.task05.task0501;

public class Cat {

    private String name;
    private int age;
    private int weight;
    private int strength;




    public static void main(String[] args) {
        Cat cat = new Cat();
        String s = "Areg";
        cat.name = s;
        System.out.println(cat.name);






    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        //String s  = "areg";

        this.name = name;



    }
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getWeight(){
        return this.weight;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getStrength(){
        return this.strength;

    }

    public void setStrength(int strength){
        this.strength = strength;
    }
}


//    Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	У класса Cat должна быть переменная name с типом String.
//        •	У класса Cat должна быть переменная age с типом int.
//        •	У класса Cat должна быть переменная weight с типом int.
//        •	У класса Cat должна быть переменная strength с типом int.
//        •	Всего в классе должно быть 4 переменных.