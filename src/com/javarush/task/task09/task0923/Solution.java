package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();


        List<Character> vowels = new ArrayList<>();
        List<Character> other = new ArrayList<>();


        char[] strToArray = s.toCharArray();

        for (char letter : strToArray) {
            if (letter == ' ') {
                //continue;

            } else if (isVowel(letter)) {
                vowels.add(letter);
            } else {
                other.add(letter);
            }
        }
// Арег привет как дела
        // а р е г
        // гласные а е
        // согланые р г
        //

        print(vowels);
        System.out.println();
        print(other);

    }


    public static void print(List<Character> list) {
        for (Character letter : list) {
            System.out.print(letter + " ");

        }

    }


    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}


//    Написать программу, которая вводит с клавиатуры строку текста.
//        Программа должна вывести на экран две строки:
//        1. первая строка содержит только гласные буквы из введённой строки.
//        2. вторая - только согласные буквы и знаки препинания из введённой строки.
//        Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
//        Пример ввода:
//        Мама мыла раму.
//
//        Пример вывода:
//        а а ы а а у
//        М м м л р м .
//
//        Требования:
//        •	Программа должна считывать данные с клавиатуры.
//        •	Программа должна выводить две строки.
//        •	Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
//        •	Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
//        •	Каждая строка должна заканчиваться пробелом.