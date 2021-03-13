package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

//        if (a < 0 || b < 0) {
//
//
//            throw new IllegalArgumentException();
//        }
//
////        a = Math.abs(a);
////        b = Math.abs(b);
        System.out.println(gcd_3(a, b));

    }

    public static int gcd_3(int a, int b) {

        if (a > 0 && b > 0) {
            while (b != 0) {
                int tmp = a % b;
                a = b;
                b = tmp;
            }
            return a;


        } else {
            throw new IllegalArgumentException();
        }

    }


}


//    Наибольший общий делитель (НОД).
//        Ввести с клавиатуры 2 целых положительных числа.
//        Вывести в консоль наибольший общий делитель.
//
//        Требования:
//        •	Программа должна считывать с клавиатуры 2 строки.
//        •	В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
//        •	Программа должна выводить данные на экран.
//        •	Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.