package com.javarush.task.task18.task1802;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        int min = Integer.MAX_VALUE;



        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if (i < min) {
                min = i;
            }
        }

        System.out.println(min);
        reader.close();
        fileInputStream.close();


    }
}


//    Ввести с консоли имя файла.
//        Найти минимальный байт в файле, вывести его на экран.
//        Закрыть поток ввода-вывода.
//
//        Требования:
//        Программа должна считывать имя файла с консоли.
//        Для чтения из файла используй поток FileInputStream.
//        В консоль должен выводиться минимальный байт, считанный из файла.
//        Поток чтения из файла должен быть закрыт.