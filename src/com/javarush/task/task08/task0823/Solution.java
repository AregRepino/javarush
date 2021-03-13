package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        string = string.trim();


       String [] words = string.split("\\s+");


       String result = "";

       for (String word : words) {
           String s = word.substring(0, 1).toUpperCase() + word.substring(1);

           // Mama + Mыла

          result = result + s + " ";
          //
          //Mama Mыла

       }

       result = result.trim();

       System.out.print(result);


        //напишите тут ваш код
        // Eeeeeee


        //String word = firstUpperCase(string);





    }


//    public static String firstUpperCase(String word) {
//
//        return word.substring(0, 1).toUpperCase() + word.substring(1);
//    }


}

//
//    Написать программу, которая вводит с клавиатуры строку текста.
//        Программа заменяет в тексте первые буквы всех слов на заглавные.
//        Вывести результат на экран.
//
//        Пример ввода:
//        мама мыла раму.
//
//        Пример вывода:
//        Мама Мыла Раму.
//
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Программа должна считывать строку с клавиатуры.
//        •	Класс Solution должен содержать один метод.
//        •	Программа должна заменять в тексте первые буквы всех слов на заглавные.