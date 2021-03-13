package com.javarush.task.task03.task0322;

/*
Большая и чистая
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        System.out.println(name + " + " + name1 + " + " + name2 + " = Чистая  любовь, да-да!");
    }
}
//    Ввести с клавиатуры три имени, вывести на экран надпись:
//        name1 + name2 + name3 = Чистая любовь, да-да!
//        Пример:
//        Вася + Ева + Анжелика = Чистая любовь, да-да!
//        Требования:
//        Программа должна выводить текст.
//        Программа должна считывать данные с клавиатуры.
//        Выведенный текст должен содержать введенное имя name1.
//        Выведенный текст должен содержать введенное имя name2.
//        Выведенный текст должен содержать введенное имя name3.
//        Выведенный тест должен полностью соответствовать заданию.
