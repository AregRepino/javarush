package com.javarush.task.task04.task0424;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a==b && a!=c ){
           System.out.println(3);

        } else if (b==c && b!=a){
            System.out.println(1);
        }else if (c==a && c!=b){
            System.out.println(2);
        }





    }
}


//    Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.
//
//        Пример для чисел 4 6 6:
//        1
//
//        Пример для чисел 6 6 3:
//        3
//        Требования:
//        Программа должна считывать числа c клавиатуры.
//        Программа должна использовать команды System.out.println() или System.out.print().
//        Программа должна выводить на экран порядковый номер числа, отличного от остальных.
//        Если все числа разные, ничего не выводить.
