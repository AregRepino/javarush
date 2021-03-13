package com.javarush.task.task15.task1528;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hrivna().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public abstract Object getAmount();
    }

    //add your code below - добавь код ниже
    public static class Hrivna extends Money {
        private double amount = 123d;

        public Hrivna getMoney() {
            return this;
        }

        @Override
        public Object getAmount() {
            return amount;
        }
    }

}


//    Исправь класс Hrivna так, чтоб избежать возникновения ошибки StackOverflowError.
//
//        Требования:
//        •	Класс Hrivna должен быть потомком класса Money.
//        •	В классе Hrivna должен быть реализован метод getAmount.
//        •	Метод getAmount в классе Hrivna должен возвращать значение поля amount.
//        •	При выполнении программы не должны возникать исключения или ошибки.