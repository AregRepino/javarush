package com.javarush.task.task18.task1819;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        byte [] bytes = new byte[100];


        //FileOutputStream fileOutputStream = new FileOutputStream();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();



        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);

        while (fileInputStream2.available() > 0) {
            int count = fileInputStream2.read(bytes);
            byteArrayOutputStream.write(bytes, 0, count);
        }

        while (fileInputStream1.available() > 0) {
            int count = fileInputStream1.read(bytes);
            byteArrayOutputStream.write(bytes, 0, count);
        }

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);
        byteArrayOutputStream.writeTo(fileOutputStream);


        byteArrayOutputStream.close();
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();









    }
}


//    Считать с консоли 2 имени файла.
//        В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
//        Закрыть потоки.
//
//        Требования:
//        •	Программа должна два раза считать имена файлов с консоли.
//        •	Не используй в программе статические переменные.
//        •	Для первого файла создай поток для чтения и считай его содержимое.
//        •	Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
//        •	Содержимое первого и второго файла нужно объединить в первом файле.
//        •	Сначала должно идти содержимое второго файла, затем содержимое первого.
//        •	Созданные для файлов потоки должны быть закрыты.
