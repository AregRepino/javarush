package com.javarush.task.task08.task0812;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            int l = Integer.parseInt(s);
            list.add(l);
        }
        //      0   1  2  3  4  5  6  7  8   9
        // list 2, 4, 4, 4, 8, 8, 4, 12, 12, 14


        int priv = list.get(0); // 2
        int count = 0; // 1
        int maxCount = 0; // 1
/// e 2
        for (Integer e : list) {
            if (e.equals(priv)) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }

            priv = e;


        }

        System.out.println(maxCount);


    }
}


//1. Создай список чисел.
//        2. Добавь в список 10 чисел с клавиатуры.
//        3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
//
//        Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
//        3
//
//        Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.
//
//        Требования:
//        •	Программа должна выводить число на экран.
//        •	Программа должна считывать значения с клавиатуры.
//        •	В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
//        •	Программа должна добавлять в коллекцию 10 чисел, согласно условию.
//        •	Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.