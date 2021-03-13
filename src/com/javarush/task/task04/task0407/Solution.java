package com.javarush.task.task04.task0407;

public class Solution {
    // публичный статичный , ничего не возрашяет . метод main (String[] args) - входные параметры
    public static void main(String[] args) {
        // создание объекта  Cat и присвоение его переменой  сat1
        Cat cat1 = new Cat();
        //напишите тут ваш код
       // Cat.count = Cat.count + 1;
        // вызов метода upCount
       // Cat.upCount();


// создание объекта  Cat и присвоение его переменой  сat2
        Cat cat2 = new Cat();
        //напишите тут ваш код
       // Cat.count = Cat.count + 1;
       // Cat.upCount();
        //cat2.upCount();
// новый Cat
        new Cat();
        new Cat();
        new Cat();
        new Cat();
        // вывод текста на экран
        System.out.println("The cat count is " + Cat.count);
    }
// публичный статичный , класс Cat
    public static class Cat {
        // публичный статичный . статическая переменое count класса Cat
        public static int count = 0;
// объявление конструктора Cat без входный переметров () - пустые скобки
    // конструктор вызаваеться каждый рыз когда создоеться новый объект типа Cat через опирацию new Cat
        public Cat() {
            // увелечение Cat.count  на +1
            Cat.count = Cat.count + 1;
        }
// upCount статический метод класса Cat
        public static void upCount () {
            Cat.count = Cat.count + 1;
        }
    }
}

//    Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильное их количество.
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Нельзя изменять строку отвечающую за вывод в консоль.
//        •	Класс Cat должен содержать только одну переменную count.
//        •	Переменная count класса Cat должна быть статической, иметь модификатор доступа public, тип int и проинициализирована нулем.
//        •	В методе main должно быть только две проинициализированные переменные типа Cat.
//        •	Переменная count должна содержать актуальное количество созданных объектов-котов.
//        Solution.java
