package com.javarush.task.task04.task0422;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int a = scanner.nextInt();

        if (a < 18){
            System.out.println("Подрасти еще");
        }

    }
}


//    Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".
//        Требования:
//        Программа должна дважды считать данные c клавиатуры.
//        Программа должна использовать команду System.out.println() или System.out.print().
//        Если возраст меньше 18 вывести только сообщение "Подрасти еще".
//        Если возраст больше либо равно 18 ничего не выводить.