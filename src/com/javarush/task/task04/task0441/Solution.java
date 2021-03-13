package com.javarush.task.task04.task0441;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a <= b || a <= c || b <=c){
            System.out.print(a);
        } else if (b <= a || b <= c || a <= c){
            System.out.print(b);
        } else if (c <= a || c <= b || a <= c){
            System.out.print(c);
        }



    }
}



//    Ввести с клавиатуры три числа, вывести на экран среднее из них.
//    Т.е. не самое большое и не самое маленькое.
//    Если все числа равны, вывести любое из них.
//
//            Требования:
//            •	Программа должна считывать числа c клавиатуры.
//            •	Программа должна выводить число на экран.
//            •	Программа должна выводить среднее из трех чисел.
//•	Если все числа равны, вывести любое из них.
//•	Если два числа из трех равны, вывести любое