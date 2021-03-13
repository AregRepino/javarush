package com.javarush.task.task06.task0610;


import java.util.Scanner;

public class ConsoleReader {






    public static String readString() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        return a;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();
        return a;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(ConsoleReader.readString());
        System.out.println(ConsoleReader.readDouble());
        System.out.println(ConsoleReader.readInt());
        System.out.println(ConsoleReader.readBoolean());


    }
}


//    Сделать класс ConsoleReader, у которого будут 4 статических метода:
//        String readString() - читает с клавиатуры строку
//        int readInt() - читает с клавиатуры число
//        double readDouble() - читает с клавиатуры дробное число
//        boolean readBoolean() - читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
//
//        Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода.
//
//        Требования:
//        •	Метод readString должен считывать и возвращать строку(тип String).
//        •	Метод readInt должен считывать и возвращать число(тип int).
//        •	Метод readDouble должен считывать и возвращать дробное число(тип double).
//        •	Метод readBoolean должен считывать и возвращать логическую переменную(тип boolean).