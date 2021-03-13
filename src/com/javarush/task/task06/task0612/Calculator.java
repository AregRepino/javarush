package com.javarush.task.task06.task0612;

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int result = a + b;
        return result;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int result = a * b;
        return result;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double c = a;
        double result = c / b;
        return result;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        // a = 40 b = 10 %      40 (a) / 100  * 10(b) = 0,4 * 10 = 4
        double result = (double) a / 100 * b;
        return result;
    }

    public static void main(String[] args) {

        Calculator.division(5, 10);
        Calculator.percent(33, 10);

    }
}

//
//    Сделать класс Calculator, у которого будут 5 статических методов:
//        int plus(int a, int b) - возвращает сумму чисел a и b
//        int minus(int a, int b) - возвращает разницу чисел a и b
//        int multiply(int a, int b) - возвращает результат умножения числа a на число b
//        double division(int a, int b) - возвращает результат деления числа a на число b
//        double percent(int a, int b) - возвращает b процентов от числа a (например, percent(4, 50) должен вернуть 50% от 4)
//
//        Требования:
//        •	Метод plus должен возвращать сумму чисел a и b.
//        •	Метод minus должен возвращать разницу чисел a и b.
//        •	Метод multiply должен возвращать результат умножения числа a на число b.
//        •	Метод division должен возвращать результат деления числа a на число b.
//        •	Метод percent должен возвращать b процентов от числа a.