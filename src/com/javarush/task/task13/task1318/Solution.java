package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();


        InputStream fileInputStream = new FileInputStream(sourceFileName);

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(fileInputStream));


        Stream<String> stringStream = fileReader.lines();


        List<String> listString = stringStream.collect(Collectors.toList());


        for (String s : listString) {
            System.out.println(s);
        }

//        while (fileInputStream.available() > 0) {
//            int data = fileInputStream.read();
//            System.out.print((char)data);
//
//        }

        fileInputStream.close();
        reader.close();
        fileReader.close();


    }
}


//1. Считать с консоли имя файла.
//        2. Вывести в консоль(на экран) содержимое файла.
//        3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
//
//        Требования:
//        •	Программа должна считывать c консоли имя файла.
//        •	Программа должна выводить на экран содержимое файла.
//        •	Поток чтения из файла (FileInputStream) должен быть закрыт.
//        •	BufferedReader также должен быть закрыт.