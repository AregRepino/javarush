package com.javarush.task.task13.task1320;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }
    }
}

//1. Реализовать интерфейс DBObject в классе User.
//        2. Реализовать метод initializeIdAndName так, чтобы программа работала и выводила на экран "The user's name is Neo, id = 1".
//        3. Метод toString и метод main менять нельзя.
//        4. Подумай, что должен возвращать метод initializeIdAndName в классе User.
//
//        Требования:
//        •	Интерфейс DBObject должен быть реализован в классе User.
//        •	Метод initializeIdAndName должен возвращать корректный объект типа User, объект на котором производится вызов метода("этот" объект).
//        •	Метод initializeIdAndName должен устанавливать значения полей id и name согласно переданным ему параметрам.
//        •	Программа должна выводить на экран: "The user's name is Neo, id = 1"
//        •	Метод toString не менять.
//        •	Метод main не менять.