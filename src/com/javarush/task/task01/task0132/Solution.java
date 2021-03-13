package com.javarush.task.task01.task0132;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));


    }

    public static int sumDigitsInNumber(int number) {

        //напишите тут ваш код
        int sum = 0; // sum равно 0, а number = 546
        sum = sum + number % 10; // sum = 0 + 6 sum = 6
        number = number/10; // number = 54 а sum = 6
        sum = sum + number % 10; // sum = 6 + 4. sum = 10 а number = 54
        number = number/10; // number = 5 sum = 10
        sum = sum + number % 10; // sum = 10 + 5



        return sum;

    }
}

//    Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
//        Пример:
//        Метод sumDigitsInNumber вызывается с параметром 546.
//
//        Пример вывода:
//        15
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	Метод sumDigitsInNumber(int) должен быть публичным и статическим.
//        •	Метод sumDigitsInNumber должен возвращать значение типа int.
//        •	Метод sumDigitsInNumber не должен ничего выводить на экран.
//        •	Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.