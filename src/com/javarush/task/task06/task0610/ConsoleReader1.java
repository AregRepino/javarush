package com.javarush.task.task06.task0610;


import java.util.Scanner;

public class ConsoleReader1 {

    public static Scanner scanner = new Scanner(System.in);




    public static String readString() throws Exception {
        //напишите тут ваш код

        String a = ConsoleReader1.scanner.nextLine();
        return a;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код

        int a = ConsoleReader1.scanner.nextInt();
        return a;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код

        return ConsoleReader1.scanner.nextDouble();

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код

        boolean a = ConsoleReader1.scanner.nextBoolean();
        return a;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(ConsoleReader1.readString());
        System.out.println(ConsoleReader1.readDouble());
        System.out.println(ConsoleReader1.readInt());
        System.out.println(ConsoleReader1.readBoolean());


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