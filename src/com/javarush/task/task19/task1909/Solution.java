package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile1 = bufferedReader.readLine();
        String nameFile2 = bufferedReader.readLine();


        FileReader fileReader = new FileReader(nameFile1);
        FileWriter fileWriter = new FileWriter(nameFile2);


        BufferedReader bufferedFileReader = new BufferedReader(fileReader);
        BufferedWriter bufferedFileWriter = new BufferedWriter(fileWriter);



        while (bufferedFileReader.ready()) {
           String line = bufferedFileReader.readLine();
           line = line.replaceAll("\\.", "!");
           bufferedFileWriter.write(line);




        }

        bufferedReader.close();
        bufferedFileReader.close();
        bufferedFileWriter.close();

    }
}


//
//    Считать с консоли 2 имени файла.
//        Первый Файл содержит текст.
//        Считать содержимое первого файла и заменить все точки "." на знак "!".
//        Результат вывести во второй файл.
//        Закрыть потоки.
//
//        Требования:
//        •	Программа должна считывать имена файлов с консоли (используй BufferedReader).
//        •	BufferedReader для считывания данных с консоли должен быть закрыт.
//        •	Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
//        •	Поток чтения из файла (BufferedReader) должен быть закрыт.
//        •	Программа должна записывать во второй файл содержимое первого файла, где заменены все точки "." на знак "!" (Для записи в файл используй BufferedWriter с конструктором FileWriter).
//        •	Поток записи в файл (BufferedWriter) должен быть закрыт.
