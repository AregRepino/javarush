package com.javarush.task.task15.task1515;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static int A;
    public static int B;
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    static {
        try {
            String s = reader.readLine();
            A = Integer.parseInt(s);
            B = Integer.parseInt(reader.readLine());

            reader.close();


        } catch (IOException e) {
            e.printStackTrace();

        }


    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}

//
//1. В статическом блоке считайте две переменные с консоли А и В с типом int.
//        2. Не забыть про IOException, который надо обработать в блоке catch.
//        3. Закрыть поток ввода методом close().
//
//        Требования:
//        •	Поле A должно быть публичным и статическим.
//        •	Поле B должно быть публичным и статическим.
//        •	Программа должна считывать данные с клавиатуры в статическом блоке.
//        •	Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
//        •	Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.