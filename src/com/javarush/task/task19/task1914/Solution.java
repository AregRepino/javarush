package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}


//
//    В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
//        Твоя ридер-обертка должна выводить на консоль решенный пример.
//        Вызови готовый метод printSomething(), воспользуйся testString.
//        Верни переменной System.out первоначальный поток.
//
//        Возможные операции: + - *
//        Шаблон входных данных и вывода: a [знак] b = c
//        Отрицательных и дробных чисел, унарных операторов - нет.
//
//        Пример вывода:
//        3 + 6 = 9
//
//        Требования:
//        •	Класс Solution должен содержать класс TestString.
//        •	Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
//        •	Класс TestString должен содержать публичный void метод printSomething().
//        •	Метод printSomething() класса TestString должен выводить на экран строку "3 + 6 = ".
//        •	Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
//        •	Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
//        •	Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
//        •	Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.