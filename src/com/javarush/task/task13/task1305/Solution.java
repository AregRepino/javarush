package com.javarush.task.task13.task1305;

public class Solution {
    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
         Hobby HOBBY = new Hobby();
    }

    public static class Hobby implements Desire , Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}


//Исправь 4 ошибки в программе, чтобы она компилировалась.
//
//        Требования:
//        •	Переменные объявленные в интерфейсе могут иметь только самый широкий уровень доступа(public).
//        •	Унаследоваться(extends) можно только от класса, для реализации интерфейсов используется ключевое слово implements.
//        •	Класс Hobby должен быть объявлен с модификатором доступа static.
//        •	Для доступа к переменной HOBBY нет необходимости создавать объект Dream.
//        •	Объявления интерфейсов не изменять.