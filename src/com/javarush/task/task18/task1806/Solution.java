package com.javarush.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("/Users/areg/IdeaProjects/JavaRush/des.txt");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("/Users/areg/IdeaProjects/JavaRush/destinatin.txt");

        if (inputStream.available() > 0) {
            //читаем весь файл одним куском
            int length = inputStream.available();
            byte[] buffer = new byte[length];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}


//    Исправить функциональность в соответствии с требованиями.
//
//        Программа должна:
//        1. Переписать все байты одного файла в другой одним куском.
//        2. Закрывать потоки ввода-вывода.
//
//        Подсказка:
//        4 ошибки.
//
//        Требования:
//        •	Программа должна использовать классы FileInputStream и FileOutputStream.
//        •	Программа должна переписать все байты одного файла в другой одним куском.
//        •	Потоки FileInputStream и FileOutputStream должны быть закрыты.
//        •	Нужно исправить 4 ошибки.