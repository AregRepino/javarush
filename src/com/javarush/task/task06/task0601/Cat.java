package com.javarush.task.task06.task0601;

public class Cat {

    protected void finalize() throws Throwable{

    }

    public static void main(String[] args) {

    }
}

//
//    В классе Cat создать метод protected void finalize() throws Throwable.
//
//        Требования:
//        •	В классе Cat должен быть метод с именем finalize.
//        •	Метод finalize ничего не должен возвращать (void).
//        •	Метод finalize должен быть protected.
//        •	Метод finalize может кидать исключение Throwable, укажи это при объявлении метода.