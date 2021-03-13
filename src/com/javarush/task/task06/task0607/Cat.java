package com.javarush.task.task06.task0607;

public class Cat {

    public static int catCount = 0;

    public static void main(String[] args) {

    }

    public Cat(){
        Cat.catCount++;
    }
}

//
//    Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
//
//        Требования:
//        •	Добавь в класс Cat конструктор.
//        •	Конструктор должен быть public.
//        •	Добавь в класс Cat поле catCount.
//        •	Поле catCount должно быть типа int.
//        •	Поле catCount должно быть статическим.
//        •	Конструктор класса должен на 1 увеличивать значение переменной catCount.