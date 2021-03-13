package com.javarush.task.task04.task0401;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Person person = new Person();
        System.out.println("Age is: " + person.age);
        person.adjustAge(a);
        person.adjustAge(30);
        System.out.println("Adjusted age is: " + person.age);





    }
// public - публичны static - статичный class - класс person имя класс
    public static class Person { // все что внутри пренадлежит классу
        // переменая класса age - переменая класс, она публичная типо int ( целое число )
    // age переменого класс а имя всегда может быть разные
        public int age = 20;
// adjustAge метод класса public - публичный void - ничего не возрошает
    // (int age) внутри круглых скопках пишим входные параментры / аргументы
        public void adjustAge(int age) {
            this.age = this.age + age; // this.age = 20 + 10
            //age = age + 20;

            System.out.println("Age in adjustAge() is: " + age);
           // System.out.println("Age in adjustAge() is: " + this.age);
        }
    }
}

//Подумайте, что делает программа.
//        Исправьте ошибку в программе чтобы переменная age объекта person изменила свое значение.
//        Подсказка:
//        тщательно просмотрите метод adjustAge
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Класс Person должен иметь публичное поле age типа int.
//        •	Метод adjustAge класса Person должен выводить текст на экран.
//        •	Метод adjustAge класса Person должен иметь только один параметр age типа int и тип возвращаемого значения void.
//        •	Метод main должен вызывать метод adjustAge только один раз.
//        •	Метод adjustAge класса Person должен увеличивать возраст человека (Person) на 20.
