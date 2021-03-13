package com.javarush.task.task04.task0436;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int d = 8;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print(d);
            }
            System.out.println();

        }
    }
}
