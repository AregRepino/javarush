package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        int count = 0;

        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if (i == ',') {
                count ++;
            }
        }

        reader.close();
        fileInputStream.close();
        System.out.println(count);

    }
}


//    С консоли считать имя файла.
//        Посчитать в файле количество символов ',', количество вывести на консоль.
//        Закрыть потоки.
//
//        Подсказка:
//        нужно сравнивать с ascii-кодом символа ','.
//
//        Требования:
//        •	Программа должна считывать имя файла с консоли.
//        •	Для чтения из файла используй поток FileInputStream.
//        •	В консоль должно выводится число запятых в считанном файле.
//        •	Поток чтения из файла должен быть закрыт.