package com.javarush.task.task19.task1913;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(byteArrayOutputStream);
        System.setOut(stream);
        testString.printSomething();
        String s = byteArrayOutputStream.toString();
        s = s.replaceAll("\\D", "");
        System.setOut(consoleStream);
        System.out.println(s);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}


//    В методе main подмени объект System.out написанной тобой ридер-оберткой по аналогии с лекцией.
//        Твоя ридер-обертка должна выводить только цифры.
//        Вызови готовый метод printSomething(), воспользуйся testString.
//        Верни переменной System.out первоначальный поток.
//        Выведи модифицированную строку в консоль.
//
//        Пример вывода:
//        12345678
//
//        Требования:
//        •	Класс Solution должен содержать класс TestString.
//        •	Класс Solution должен содержать публичное статическое поле testString типа TestString, которое сразу проинициализировано.
//        •	Класс TestString должен содержать публичный void метод printSomething().
//        •	Метод printSomething() класса TestString должен выводить на экран строку "it's 1 a 23 text 4 f5-6or7 tes8ting".
//        •	Метод main(String[] args) класса Solution должен создавать поток PrintStream (используй PrintStream c параметром конструктора ByteArrayOutputStream).
//        •	Метод main(String[] args) класса Solution должен подменять и восстанавливать поток вывода в консоль объекта System.out.
//        •	Метод main(String[] args) класса Solution должен вызывать метод printSomething(),объекта testString.
//        •	Метод main(String[] args) класса Solution должен модифицировать строку выведенную методом printSomething() согласно заданию, и выводить её в консоль.