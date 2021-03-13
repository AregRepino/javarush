package com.javarush.task.task06.task0602;

public class Cat {

    protected void finalize() throws Throwable{

        System.out.println("A Cat was destroyed");

    }

    public static void main(String[] args) {

    }

    //напишите тут ваш код

}

class Dog {
    protected void finalize() throws Throwable{

        System.out.println("A Dog was destroyed");

    }

}

//
//    В каждом классе Cat и Dog написать метод finalize, который выводит на экран текст о том, что такой-то объект уничтожен.
//
//        Требования:
//        В классе Cat должен быть void метод finalize.
//        В классе Dog должен быть void метод finalize.
//        В классах Cat и Dog не должно быть конструкторов или должны быть конструкторы без параметров.
//        Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
//        Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".