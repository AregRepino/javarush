package com.javarush.task.task05.task0514;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
        person.initialize("areg", 26);
    }

    static class Person {
        //напишите тут ваш код
        private String name;
        private int age;

        public void initialize(String name, int age){
            this.name = name;
            this.age = age;
    }

    }
}


//Создать class Person. У человека должно быть имя String name, возраст int age.
//        Добавь метод initialize(String name, int age), в котором проинициализируй переменные name и age.
//        В методе main создай объект Person, занеси его ссылку в переменную person.
//        Вызови метод initialize с любыми значениями.
//
//        Требования:
//        •	Класс Solution должен содержать класс Person.
//        •	У класса Person должна быть переменная name с типом String.
//        •	У класса Person должна быть переменная age с типом int.
//        •	У класса Person должен быть метод initialize, принимающий в качестве параметра имя, возраст и инициализирующий соответствующие переменные класса.
//        •	Необходимо создать объект типа Person и занести его ссылку в переменную person.
//        •	Необходимо вызвать метод initialize у созданного объекта и передать в него какие-либо параметры.