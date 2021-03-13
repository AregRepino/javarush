package com.javarush.task.task07.task0717;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++){

           String s = reader.readLine();
           list.add(s);
        }

        ArrayList<String> result = doubleValues(list);
        // Вывести на экран result
        for (String s : result){
            System.out.println(s);
        }




    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код

        ArrayList<String> result = new ArrayList<>();

        for (String s: list){

            result.add(s);
            result.add(s);

        }





        return result;
    }
}

//
//1. Введи с клавиатуры 10 слов в список строк.
//
//        2. Метод doubleValues должен удваивать слова по принципу:
//        "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//
//        3. Выведи результат на экран, каждое значение с новой строки.
//
//        Требования:
//        •	Объяви переменную типа список строк и сразу проинициализируй ee.
//        •	Считай 10 строк с клавиатуры и добавь их в список.
//        •	Метод doubleValues должен удваивать элементы списка по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
//        •	Выведи получившийся список на экран, каждый элемент с новой строки.
