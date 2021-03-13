package com.javarush.task.task04.task0421;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

// стравнение name1 и name2 по содержанию . equals - сравнение по  содежанию

        if (name1.equals(name2)){
            System.out.println("Имена идентичны");
            // length - длина возрашает количество букв в страке
            // сравнение по каличиству символов
        } else if (name1.length() == name2.length()){
            System.out.println("Длины имен равны");
        }





    }
}


//    Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
//        Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
//        Если имена и длины имен разные - ничего не выводить.
//        Требования:
//        Программа должна считывать две строки c клавиатуры.
//        Программа должна содержать System.out.println() или System.out.print()
//        Если имена одинаковые вывести сообщение "Имена идентичны"
//        Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
//        Если имена и длины имен разные - ничего не выводить.
