package com.javarush.task.task03.task0319;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        //Scanner scanner1 = new Scanner(System.in);
        //Scanner scanner2 = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int age1 = scanner.nextInt();

        System.out.println(name + " получает " + age + " через " + age1 + " лет.");


    }
}

//    Ввести с клавиатуры отдельно Имя, число1, число2.
//        Вывести надпись:
//        "Имя" получает "число1" через "число2" лет.
//        Пример:
//        Коля получает 3000 через 5 лет.