package com.javarush.task.task06.task0614;

import java.util.ArrayList;

public class Cat {
// public публичный  static статичный, принадлежащий этому классу
// ArrayList<Cat> - массив страки <Cat> cats - переменная  = - пресвоение  new - создание нового обекта  ArrayList<>();
    public static ArrayList<Cat> cats = new ArrayList<>();
//  конструктор public - публичный Cat - имея класса ()
    public Cat() {

    }


// public публичный  static статичный принадлежащий этому классу
// void - ничего не возрашает  main имя метода (String[] args)
    public static void main(String[] args) {
        //напишите тут ваш ко
        // for - цикол  (int - тип переменой i - имея переменой
        //  = - присвоение 0; i < - знак меньше  10; i++ - умелечение на 1){
        //  Cat cat = new Cat();
        for (int i = 0; i < 10; i++){
            Cat cat = new Cat();
// cats.add добавить в переменную cats
            cats.add(cat);

        }

        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код

        // cats.size - переменная cats size- размер
        for (int i = 0; i < cats.size(); i++){
            // cats.get(i) cats переменная  get добавит (i) - которая увеличивается на 1
            System.out.println(cats.get(i));

        }
    }
}
