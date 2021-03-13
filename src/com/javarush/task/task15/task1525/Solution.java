package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static List<String> lines = new ArrayList<String>();

    static {
        //String s = Statics.FILE_NAME;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            Stream<String> stream = reader.lines();

            Collection<String> collection = stream.collect(Collectors.toList());

            lines.addAll(collection);

        } catch (IOException e) {
            e.printStackTrace();

        }





    }

    public static void main(String[] args) {


        System.out.println(lines);
    }


}


//1. Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
//        2. В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.
//
//        Требования:
//        •	Константа FILE_NAME не должна быть пустой.
//        •	В статическом блоке все строки из файла с именем FILE_NAME должны быть добавлены по отдельности в список lines.
//        •	Поле FILE_NAME НЕ должно быть final.
//        •	Класс Solution должен содержать список lines.