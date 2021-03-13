package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        int max = Integer.MIN_VALUE;



        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if (i > max) {
                max = i;
            }
        }

        reader.close();
        fileInputStream.close();

        System.out.println(max);
    }
}


//    Ввести с консоли имя файла.
//        Найти максимальный байт в файле, вывести его на экран.
//        Закрыть поток ввода-вывода.
//
//        Требования:
//        •	Программа должна считывать имя файла с консоли.
//        •	Для чтения из файла используй поток FileInputStream.
//        •	В консоль должен выводиться максимальный байт, считанный из файла.
//        •	Поток чтения из файла должен быть закрыт.