package com.javarush.task.task04.task0436;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

// digit - это цифра = 8
        int digit = 8;
// создаем переменую типо int = 0 где i < m - это ввод с клавиатуры, затем
        //увеличеваем это значение на 1
        for (int i = 0; i < m; i = i + 1) {
            //создаем переменую типо int = 0 где j < n - это ввод с клавиатуры, затем
            //увеличеваем это значение на 1
            for (int j = 0; j < n; j = j + 1) {
                // ввывод текстан экран
                System.out.print(digit);
            }
// перевод строки
            System.out.println();
        }


    }
}

//    Ввести с клавиатуры два числа m и n.
//        Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
//
//        Пример: m=2, n=4
//        8888
//        8888
//
//        Требования:
//        •	Программа должна считывать два числа c клавиатуры.
//        •	Программа должна выводить текст на экран.
//        •	Программа должна выводить прямоугольник размером m на n из восьмёрок.
//        •	В программе должен использоваться цикл for.