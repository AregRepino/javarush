package com.javarush.task.task08.task0812.fix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(Integer.parseInt(s));
        }

        int i = count(list);
        System.out.println(i);

    }

    public static int count(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int count = 1;
        int maxCount = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1).equals(list.get(i))) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }
        }


        return maxCount;
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
