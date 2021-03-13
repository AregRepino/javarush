package com.javarush.task.task06.task0606;

import java.io.IOException;
import java.util.Scanner;

public class Solution1 {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);


        String s = scanner.nextLine();
        char[] a = s.toCharArray();

        for (int j = 0; j < a.length; j++) {


            char c = a[j];
            String d = "" + c;
            int i = Integer.parseInt(d);

            //System.out.println(c);

            if (i % 2 == 0) {
                even++;

            } else {
                odd++;
            }
        }


        System.out.println("Even: " + even + " Odd: " + odd);


    }
}
