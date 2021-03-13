package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new HashMap<>();

        String fileName = args[0];

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line = reader.readLine();

        while (line != null) {
            // мы что-то делаем с  line
            // line = Петров 2
            String[] str = line.split(" ");
            String name = str[0];
            Double value = Double.parseDouble(str[1]);

            if (map.containsKey(name)) {
                value = value + map.get(name);
            }

            map.put(name, value);
            line = reader.readLine();

        }

        reader.close();

        List<String> names = new ArrayList<>(map.keySet());

        Collections.sort(names);

        for (String name : names) {
            Double value = map.get(name);
            System.out.println(name + " " + value);
        }


    }
}


//    В метод main первым параметром приходит имя файла.
//        В этом файле каждая строка имеет следующий вид:
//        имя значение
//        где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.
//
//        Для каждого имени посчитать сумму всех его значений.
//        Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
//        Закрыть потоки.
//
//        Пример входного файла:
//        Петров 2
//        Сидоров 6
//        Иванов 1.35
//        Петров 3.1
//
//        Пример вывода:
//        Иванов 1.35
//        Петров 5.1
//        Сидоров 6.0
//
//        Требования:
//        •	Программа НЕ должна считывать данные с консоли.
//        •	Программа должна считывать содержимое файла (используй FileReader).
//        •	Поток чтения из файла (FileReader) должен быть закрыт.
//        •	Программа должна выводить в консоль каждое имя и сумму всех его значений, все данные должны быть отсортированы в возрастающем порядке по имени.