package com.javarush.task.task04.task0412;

import java.util.Scanner;


public class Solution1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
           a = a * 2;
        } else if (a < 0) {
            a = a + 1;
        } else  {
            a = 0;


        }
        System.out.println(a);
    }
}

//    Ввести с клавиатуры число.
//        Если число положительное, то увеличить его в два раза.
//        Если число отрицательное, то прибавить единицу.
//        Если введенное число равно нулю, необходимо вывести ноль.
//        Вывести результат на экран.
//        Требования:
//        •	Программа должна считывать число c клавиатуры.
//        •	Программа должна выводить число на экран.
//        •	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
//        •	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
//        •	Если введенное число равно нулю, необходимо вывести ноль.