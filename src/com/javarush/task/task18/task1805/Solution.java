package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
//        int data = fileInputStream.read();

        List<Integer> list = new ArrayList<>();
        //List<Integer> fullList = new ArrayList<>();

        //Set<Integer> set = new HashSet<>();




        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();

//            fullList.add(data);
            //set.add(data);

            if (!list.contains(data)) {
                list.add(data);
            }


        }

        fileInputStream.close();

        Collections.sort(list);

//        List<Integer> sortedList = new ArrayList<>(set);
//
//        Collections.sort(sortedList);



        for (Integer i : list) {
            System.out.print(i + " ");
        }

//        System.out.println("-------------");
//
//        for (Integer i : sortedList) {
//            System.out.println(i);
//        }






    }


}



//    Ввести с консоли имя файла.
//        Считать все байты из файла.
//        Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
//        Вывести на экран.
//        Закрыть поток ввода-вывода.
//
//        Пример байт входного файла:
//        44 83 44
//
//        Пример вывода:
//        44 83
//
//        Требования:
//        •	Программа должна считывать имя файла с консоли.
//        •	Для чтения из файла используй поток FileInputStream.
//        •	В консоль через пробел должны выводиться все уникальные байты из файла в порядке возрастания.
//        •	Данные в консоль должны выводится в одну строку.
//        •	Поток чтения из файла должен быть закрыт.