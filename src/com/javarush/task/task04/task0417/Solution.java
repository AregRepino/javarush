package com.javarush.task.task04.task0417;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
// главное последовательность так как если мы сначало бы сравнили а=б и б=с
        // то до а=б и б=с не проверил бы
        // условия должны быть не перекрывать а > 3 оно перекрывает а > 5
        if (a == b && b == c ){
            System.out.print(a + " " + b + " " + c);
        } else if (a == b){
            System.out.print(a + " " + b);
        } else if (b == c){
            System.out.print(b + " " + c);
        } else if (a == c){
            System.out.print(a + " " + c);
        }


    }
}
