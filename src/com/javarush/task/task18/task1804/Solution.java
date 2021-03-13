package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());



    }
}


//
//    Ввести с консоли имя файла.
//        Найти байт или байты с минимальным количеством повторов.
//        Вывести их на экран через пробел.
//        Закрыть поток ввода-вывода.
//
//        Требования:
//        •	Программа должна считывать имя файла с консоли.
//        •	Для чтения из файла используй поток FileInputStream.
//        •	В консоль через пробел должны выводиться все байты из файла с минимальным количеством повторов.
//        •	Данные в консоль должны выводится в одну строку.
//        •	Поток чтения из файла должен быть закрыт.