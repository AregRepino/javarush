package com.javarush.task.task04.task0443;

//import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String name = scanner.nextLine();
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();

        String s = "Меня зовут ";
        s = s + name + ".";

        String e = "Я родился ";
        e = e + day + "." + month + "." + year;

        System.out.println(s);

        System.out.println(e);


    }
}



//    Ввести с клавиатуры строку name.
//        Ввести с клавиатуры дату рождения (три числа): y, m, d.
//
//        Вывести на экран текст:
//        "Меня зовут name.
//        Я родился d.m.y"
//
//        Пример вывода:
//        Меня зовут Вася.
//        Я родился 15.2.1988
//
//        Требования:
//        •	Программа должна считывать строки c клавиатуры.
//        •	Программа должна выводить строки на экран.
//        •	Программа должна выводить текст, шаблон которого указан в задании.
//        •	Каждое предложение вывести с новой строки.