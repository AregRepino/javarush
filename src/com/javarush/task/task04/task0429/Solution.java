package com.javarush.task.task04.task0429;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int positiveCount = 0;
        int negativeCount = 0;

        if (a > 0){
            positiveCount = positiveCount + 1;
        } else if (a < 0){
            negativeCount = negativeCount + 1;

        }
        if (b > 0){
            positiveCount = positiveCount + 1;
        } else if (b < 0){
            negativeCount = negativeCount + 1;

        }


        if (c > 0){
            positiveCount = positiveCount + 1;
        } else if (c < 0){
            negativeCount = negativeCount + 1;

        }

        System.out.println("количество отрицательных чисел: " + negativeCount);
        System.out.println("количество положительных чисел: " + positiveCount);




    }
}


//    Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
//        "количество отрицательных чисел: а", "количество положительных чисел: б",
//        где а, б - искомые значения.
//
//        Пример:
//        а) при вводе чисел
//        2
//        5
//        6
//        получим вывод
//        количество отрицательных чисел: 0
//        количество положительных чисел: 3
//
//        Пример:
//        б) при вводе чисел
//        -2
//        -5
//        6
//        получим вывод
//        количество отрицательных чисел: 2
//        количество положительных чисел: 1
//
//        Требования:
//        Программа должна считывать числа c клавиатуры.
//        Программа должна выводить текст на экран.
//        Программа должна выводить количество отрицательных чисел в исходном наборе.
//        Программа должна выводить количество положительных чисел в исходном наборе.
//        Если отрицательных чисел нет, программа должна вывести "количество отрицательных чисел: 0".
//        Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
//        Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.