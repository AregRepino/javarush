package com.javarush.task.task04.task0432;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = scanner.nextInt();
        while (n > 0)
        {
            System.out.println(text);
            n = n - 1;
        }

    }
}
//    Ввести с клавиатуры строку и число N больше 0.
//        Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.
//
//        Пример ввода:
//        абв
//        2
//
//        Пример вывода:
//        абв
//        абв
//
//        Требования:
//        •	Программа должна считывать текст c клавиатуры.
//        •	Программа должна выводить текст на экран.
//        •	Каждое значение должно быть выведено с новой строки.
//        •	Программа должна выводить на экран строку N раз.
//        •	В программе должен использоваться цикл while.