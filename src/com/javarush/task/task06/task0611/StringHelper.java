package com.javarush.task.task06.task0611;

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result = result + s;

        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";

        for (int i = 0; i < count; i++) {
            result = result + s;

        }

        return result;


    }


    public static void main(String[] args) {
        String name = StringHelper.multiply("Areg");
        String countName = StringHelper.multiply("Red", 33);
        System.out.println(name);
        System.out.println(countName);

    }
}


//    Сделать класс StringHelper, у которого будут 2 статических метода:
//        String multiply(String s, int count) - возвращает строку повторенную count раз.
//        String multiply(String s) - возвращает строку повторенную 5 раз.
//
//        Пример:
//        Амиго -> АмигоАмигоАмигоАмигоАмиго
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	Методы класса StringHelper должны возвращать строку.
//        •	Методы класса StringHelper должны быть статическими.
//        •	Методы класса StringHelper должны быть public.
//        •	Метод multiply(String s, int count) должен возвращать строку повторенную count раз.
//        •	Метод multiply(String s) должен возвращать строку повторенную 5 раз.