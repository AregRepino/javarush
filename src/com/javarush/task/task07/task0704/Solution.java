package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];


        for (int i = 0; i < list.length; i++){
            String s = reader.readLine();
            list[i]= Integer.parseInt(s);
        }

       for (int  i = list.length-1; i >= 0; i--){

           System.out.println(list[i]);

       }


    }
}


//1. Создать массив на 10 чисел.
//        2. Ввести с клавиатуры 10 чисел и записать их в массив.
//        3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
//
//        Требования:
//        Программа должна создавать массив на 10 целых чисел.
//        Программа должна считывать числа для массива с клавиатуры.
//        Программа должна выводить 10 строчек, каждую с новой строки.
//        Массив должен быть выведен на экран в обратном порядке.