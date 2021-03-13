package com.javarush.task.task04.task0442;

import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) throws Exception{



    Scanner scanner = new Scanner(System.in);

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