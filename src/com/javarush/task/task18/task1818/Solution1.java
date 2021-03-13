package com.javarush.task.task18.task1818;

import java.io.*;

public class Solution1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        byte [] bytes = new byte[100];



        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);
        FileInputStream fileInputStream3 = new FileInputStream(fileName3);

        while (fileInputStream2.available() > 0) {
            int count = fileInputStream2.read(bytes);

            fileOutputStream1.write(bytes, 0, count);
        }

        while (fileInputStream3.available() > 0) {
            int count = fileInputStream3.read(bytes);
            fileOutputStream1.write(bytes, 0, count);
        }

        fileOutputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();

    }
}

//
//    Считать с консоли 3 имени файла.
//        Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
//        Закрыть потоки.
//
//        Требования:
//        •	Программа должна три раза считать имена файлов с консоли.
//        •	Для первого файла создай поток для записи. Для двух других - потоки для чтения.
//        •	Содержимое второго файла нужно переписать в первый файл.
//        •	Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
//        •	Созданные для файлов потоки должны быть закрыты.
