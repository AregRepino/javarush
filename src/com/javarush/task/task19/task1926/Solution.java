package com.javarush.task.task19.task1926;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        FileReader fileReader = new FileReader(bufferedReader.readLine());
        BufferedReader bufferedReader1 = new BufferedReader(fileReader);

        String line = bufferedReader1.readLine();

        while (line != null) {

            StringBuilder stringBuilder = new StringBuilder(line);
            stringBuilder.reverse();

            String revers = stringBuilder.toString();
            System.out.println(revers);

            line = bufferedReader1.readLine();
        }


        bufferedReader.close();
        bufferedReader1.close();

    }


}

//
//1. Считать с консоли имя файла. Считать содержимое файла.
//        2. Для каждой строки в файле:
//        2.1. переставить все символы в обратном порядке.
//        2.2. вывести на экран.
//        3. Закрыть потоки.
//
//        Пример тела входного файла:
//        я - программист.
//        Амиго
//
//        Пример результата:
//        .тсиммаргорп - я
//        огимА
//
//        Требования:
//        •	Программа должна считывать имя файла с консоли (используй BufferedReader).
//        •	BufferedReader для считывания данных с консоли должен быть закрыт.
//        •	Программа должна считывать содержимое файла (используй FileReader).
//        •	Поток чтения из файла (FileReader) должен быть закрыт.
//        •	Программа должна выводить в консоль все символы из файла в обратном порядке.