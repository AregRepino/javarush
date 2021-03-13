package com.javarush.task.task04.task0442;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        // Scanner - тип scanner название переменой new Scanner создание нового объекта типа Scanner
        Scanner scanner = new Scanner(System.in);
        //int a = scanner.nextInt();
        int sum = 0;

        while (true) {
            int number = scanner.nextInt();
             sum = sum + number;
           if (number == -1){
               break;
           }


        }
        System.out.print(sum);




    }

}
