package com.javarush.task.task04.task0419;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int e = scanner.nextInt();

        if (a >= b && a >= c && a >= e){
            System.out.println(a);
        } else if (b >= a && b >= c && b >= e){
            System.out.println(b);
        } else if (c >= a && c >= b && c >= e){
            System.out.println(c);
        } else if (e >= a && e >= b && e >= c){
            System.out.println(e);
        }

    }
}

//    Ввести с клавиатуры четыре числа, и вывести максимальное из них.
//        Если числа равны между собой, необходимо вывести любое.
//        Требования:
//        •	Программа должна считывать числа c клавиатуры.
//        •	Программа должна выводить число на экран.
//        •	Программа должна выводить на экран максимальное из четырёх чисел.
//        •	Если максимальных чисел несколько, необходимо вывести любое из них.
//        Solution.java
