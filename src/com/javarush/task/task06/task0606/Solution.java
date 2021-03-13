package com.javarush.task.task06.task0606;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
//статическая переменная even
    public static int even;
    //статическая переменная odd
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        //  создание объякта типо Scanner для считывание с клавиатуры
        Scanner scanner = new Scanner(System.in);

// перевенная s типа String и  = присвоение к результату сканирования
        String s = scanner.nextLine();
        //  метод toCharArray() создает массив элементов типа  char из строки s
        // результат присваиваем в перименую  a типа char[] это массив из элементов типа char
        char[] a = s.toCharArray();

        // цикл for ( int - тип переменой J - переменая = - присваеваеться 0
        // j < - меньше a.length- длины массиво(количество элеметов в a) j++ -   увелечение на один

        for (int j = 0; j < a.length; j++) {

//  char c = - присвоение  a[j]- это взять j элемент из массива а
            char c = a[j];
            // перевод с char в строку
            String d = "" + c;
            // переменая i типа int = - присвоение Integer.parseInt(d) -
            // parseInt(d) - конвертация строки в целое число
            int i = Integer.parseInt(d);

            //System.out.println(c);
// if если - (i- переменая  % - деление считывание остаток  2 == - равно  0)
            if (i % 2 == 0) {
                even++;
// else в противном случии
            } else {
                odd++;
            }
        }

// ввывод на эран Even: even Odd: 2 odd
        System.out.println("Even: " + even + " Odd: " + odd);


    }
}

//
//    Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
//        Увеличиваем на 1 счетчик четных цифр (статическая переменная даже).
//        Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная странный).
//        Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, б - количество нечетных цифр.
//
//        Пример для числа 4445:
//        Even: 3 Odd: 1
//
//        Требования:
//        •	Программа должна считывать данные с клавиатуры.
//        •	Метод main должен посчитать сколько четных цифр во веденном числе и записать это количество в переменную even