package com.javarush.task.task15.task1503;

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuriousCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.Lanos().printlnDesire();



    }

    public static class Ferrari {
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos {
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }

    public static class CheapCar {
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }

    }


    public static class LuxuriousCar {
        protected void printlnDesire() {
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }


    public static interface Constants {
        public static final String WANT_STRING = "Я хочу ездить на ";
        public static final  String LUXURIOUS_CAR = "роскошной машине";
        public static final String CHEAP_CAR = "дешевой машине";
        public static final String FERRARI_NAME = "Феррари";
        public static final String LANOS_NAME = "Ланосе";
    }
}


//1. Для вывода используй только переменные из класса Constants.
//        2. В классе Ferrari реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Феррари".
//        3. В классе Lanos реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на Ланосе".
//        4. Создайте public static класс LuxuriousCar(РоскошнаяМашина).
//        5. Создайте public static класс CheapCar(ДешеваяМашина).
//        6. Унаследуйте Ferrari и Lanos от CheapCar и LuxuriousCar, подумайте, какой класс для кого.
//        7. В классе LuxuriousCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на роскошной машине".
//        8. В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я хочу ездить на дешевой машине".
//        9. В классах LuxuriousCar и CheapCar для метода printlnDesire расставьте различными способами модификаторы доступа так, чтобы в классах Ferrari и Lanos выполнялось расширение видимости.
//
//        Требования:
//        Класс Solution должен содержать public static класс LuxuriousCar.
//        Класс Solution должен содержать public static класс CheapCar.
//        Класс Ferrari должен быть потомком класса LuxuriousCar.
//        Класс Lanos должен быть потомком класса CheapCar.
//        Метод printlnDesire в классе LuxuriousCar, должен выводить на экран фразу "Я хочу ездить на роскошной машине".
//        Метод printlnDesire в классе CheapCar, должен выводить на экран фразу "Я хочу ездить на дешевой машине".
//        Метод printlnDesire в классе Ferrari, должен выводить на экран фразу "Я хочу ездить на Феррари".
//        Метод printlnDesire в классе Lanos, должен выводить на экран фразу "Я хочу ездить на Ланосе".
//        Область видимости методов printlnDesire в классах Ferrari и Lanos должна быть шире, чем в их классах родителях.