package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile1 = bufferedReader.readLine();
        String nameFile2 = bufferedReader.readLine();

        FileReader fileReader = new FileReader(nameFile1);
        FileWriter fileWriter = new FileWriter(nameFile2);


//        for (int i = 1; fileReader.ready(); i++) {
//            int count = fileReader.read();
//            if (i % 2 == 0) {
//                fileWriter.write(count);
//            }
//        }

        int i = 1;

        while (fileReader.ready()) {
            int data = fileReader.read();
            if (i % 2 == 0) {
                fileWriter.write(data);
            }
            i++;
        }

        bufferedReader.close();
        fileReader.close();
        fileWriter.close();

    }
}


//    Считать с консоли 2 имени файла.
//        Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).
//
//        Пример первого файла:
//        text in file
//        Вывод во втором файле:
//        eti ie
//        Закрыть потоки ввода-вывод
//
//        Требования:
//        •	Программа должна считывать имена файлов с консоли (используй BufferedReader).
//        •	BufferedReader для считывания данных с консоли должен быть закрыт.
//        •	Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
//        •	Поток чтения из файла (FileReader) должен быть закрыт.
//        •	Программа должна записывать во второй файл все байты из первого файла с четным порядковым номером (используй FileWriter).
//        •	Поток записи в файл (FileWriter) должен быть закрыт.
