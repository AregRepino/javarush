package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(name);
        FileOutputStream fileOutputStream2 = new FileOutputStream(name2);

        byte[] buffer = new byte[fileInputStream.available()];
        if (fileInputStream.available() > 0)
        {
            int count = fileInputStream.read(buffer);
        }
        //

        byte[] buffer2 = new byte[buffer.length];
        for (int i = 0; i < buffer.length; i++) {
            buffer2[i] = buffer[buffer.length-1-i];
        }

        fileOutputStream2.write(buffer2);


        bufferedReader.close();
        fileInputStream.close();
        fileOutputStream2.close();

    }
}


//    Считать с консоли 2 имени файла: файл1, файл2.
//        Записать в файл2 все байты из файл1, но в обратном порядке.
//        Закрыть потоки.
//
//        Требования:
//        •	Программа должна два раза считать имена файлов с консоли.
//        •	Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
//        •	Во второй файл нужно записать все байты из первого в обратном порядке.
//        •	Потоки FileInputStream и FileOutputStream должны быть закрыты.