package com.javarush.task.task19.task1923;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        String line = bufferedReader.readLine();

        while (line != null) {

            String[] strArray = line.split(" ");
            for (String s : strArray) {
                if (s.matches(".*\\d+.*")) {
                    bufferedWriter.write(s + " ");
                }
            }
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();

    }
}


//    В метод main первым параметром приходит имя файла1, вторым - файла2.
//        Файл1 содержит строки со словами, разделенными пробелом.
//        Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
//        Закрыть потоки.
//
//        Требования:
//        •	Программа НЕ должна считывать данные с консоли.
//        •	Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
//        •	Поток чтения из файла (FileReader) должен быть закрыт.
//        •	Программа должна записывать во второй файл все слова из первого файла которые содержат цифры (используй FileWriter).
//        •	Поток записи в файл (FileWriter) должен быть закрыт.
