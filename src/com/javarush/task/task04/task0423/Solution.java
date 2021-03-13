package com.javarush.task.task04.task0423;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int a = scanner.nextInt();

        if (a > 20){
            System.out.println("И 18-ти достаточно");
        }

    }
}


//    Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".
//        Требования:
//        Программа должна считывать строки c клавиатуры.
//        Программа должна использовать команду System.out.println() или System.out.print().
//        Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
//        Если возраст меньше либо равно 20 ничего не выводить.