package com.javarush.task.task18.task1810;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in;

        while(true){
            // вопрос: почему переменая fileName типо String
            // потому что String
            String fileName = reader.readLine();
            in = new FileInputStream(fileName);
            if(in.available() < 1000){
                in.close();
                reader.close();
                throw new DownloadException();
            }
            in.close();
        }

    }

    public static class DownloadException extends Exception {

    }
}


//1 Считывать с консоли имена файлов.
//        2 Если файл меньше 1000 байт, то:
//        2.1 Закрыть потоки работы с файлами.
//        2.2 Выбросить исключение DownloadException.
//
//        Требования:
//        •	Программа должна считать имена файлов с консоли.
//        •	Для чтения из файлов используй поток FileInputStream.
//        •	Программа должна работать, пока введенный файл не окажется меньше 1000 байт.
//        •	Программа должна завершиться исключением DownloadException.
//        •	Поток FileInputStream должен быть закрыт.
