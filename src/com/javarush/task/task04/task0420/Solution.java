package com.javarush.task.task04.task0420;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

//        int max = max(a, b, c);
//        int min = min(a, b, c);
//        int middle = middle(a, b, c, max, min);

//        System.out.println(max + " " + middle + " " + min);
        // arr - создание массива из трех цисел a b c
        // индекс элементов начинаеться от нулю
        int[] arr = new int[]{a, b, c};
        // сортировка элементов массива по возростанию
        Arrays.sort(arr);
        // порядок вывода значений 2 1 0 - от большего к меньшиму 3 2 1
        System.out.println(arr[2] + " " + arr[1] + " " + arr[0]);



    }

    public static int max ( int a, int b, int c){
        if (a >= b && a >= c){
            return a;
        } else if (b >= a && b >= c){
            return b;
        } else {
            return c;
        }
    }


    public static int min (int a, int b, int c){
        if (a <= b && a <= c){
            return a;
        } else if (b <= a && b <= c){
            return b;
        } else {
            return c;
        }
    }

    public static int middle (int a, int b, int c, int max, int min){
        if (a >= b && a <= max){
            return a;
        } else if (b > min && b < max ){
            return b;
        } else {
            return c;
        }
    }
}


//    Ввести с клавиатуры три числа, и вывести их в порядке убывания.
//        Выведенные числа должны быть разделены пробелом.
//        Требования:
//        •	Программа должна считывать числа c клавиатуры.
//        •	Программа должна выводить числа на экран.
//        •	Программа должна выводить три числа разделенных пробелами.
//        •	Программа должна выводить числа в порядке убывания.
