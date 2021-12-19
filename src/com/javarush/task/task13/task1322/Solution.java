package com.javarush.task.task13.task1322;

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject();
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    public static class StringObject implements SimpleObject<String> {
        public SimpleObject<String> getInstance() {
            return new StringObject();
        }
    }
}

//
//    Создай класс StringObject и реализуй в нем интерфейс SimpleObject с параметром типа String.
//        Программа должна компилироваться.
//
//        Требования:
//        •	Класс StringObject должен реализовывать интерфейс SimpleObject.
//        •	Интерфейс SimpleObject в классе StringObject должен быть реализован с параметром типа String.
//        •	В классе StringObject реализовать метод getInstance интерфейса SimpleObject.
//        •	Класс StringObject должен существовать в классе Solution.
//        •	Класс StringObject должен быть статическим.
