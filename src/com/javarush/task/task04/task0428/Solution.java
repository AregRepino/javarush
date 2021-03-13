package com.javarush.task.task04.task0428;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // count количестово counter - счетчик

        int count = 0;
        if (a > 0){
            count = count + 1;
        }
        if (b > 0){
            count = count + 1;
        }
        if (c > 0){
            count = count +1;
        }

        System.out.println(count);



    }

}

//    Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
//
//        Примеры:
//        а) при вводе чисел
//        -4
//        6
//        6
//        получим вывод
//        2
//
//        б) при вводе чисел
//        -6
//        -6
//        -3
//        получим вывод
//        0
//        в) при вводе чисел
//        0
//        1
//        2
//        получим вывод
//        2
//        Требования:
//        Программа должна считывать числа c клавиатуры.
//        Программа должна выводить число на экран.
//        Программа должна выводить количество положительных чисел в исходном наборе.
//        Если положительных чисел нет, программа должна вывести "0".
//        Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
