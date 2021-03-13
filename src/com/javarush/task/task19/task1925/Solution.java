package com.javarush.task.task19.task1925;


import java.io.*;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];
        FileReader fileReader = new FileReader(fileName1);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(fileName2);
        //BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        List<String> lines = bufferedReader.lines().collect(Collectors.toList());


        for (int i = 0; i < lines.size(); i ++) {

            String line = lines.get(i);
            String[] words = line.trim().split("\\s+");


            String commaLine = "";

            for (String word : words) {
                if (word.length() > 6) {
                    commaLine = commaLine + word + ",";
                }
            }

            if (commaLine.isEmpty()) {
                continue;
            }

            commaLine = commaLine.substring(0, commaLine.length() - 1);

            if (i != lines.size() -1) {
                commaLine = commaLine + "\n";
            }

            // String commaLine =  line.trim().replace(" ", ",");
            fileWriter.write(commaLine);


        }


        bufferedReader.close();
        fileWriter.close();

    }
}
//    В метод main первым параметром приходит имя файла1, вторым - файла2.
//        Файл1 содержит слова, разделенные пробелом.
//        Записать через запятую в Файл2 слова, длина которых строго больше 6.
//        В конце файла2 запятой не должно быть.
//        Закрыть потоки.
//
//        Пример выходных данных в файл2:
//        длинное,короткое,аббревиатура
//
//        Требования:
//        •	Программа НЕ должна считывать данные с консоли.
//        •	Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
//        •	Поток чтения из файла (FileReader) должен быть закрыт.
//        •	Программа должна записывать через запятую во второй файл все слова из первого файла длина которых строго больше 6(используй FileWriter).
//        •	Поток записи в файл (FileWriter) должен быть закрыт.
