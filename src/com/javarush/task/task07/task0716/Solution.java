package com.javarush.task.task07.task0716;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
//        for (int i = 0; i < strings.size(); i++) {
//
//            String s = strings.get(i);
//
//
//            if (s.contains("р") && s.contains("л")) {
//
//            } else if (s.contains("р")) {
//                strings.remove(i);
//            } else if (s.contains("л")) {
//                strings.add(i, s);
//            }
//
//        }


        ArrayList<String> result = new ArrayList<>();

        for (String s : strings){

            if (s.contains("р") && s.contains("л")) {
                result.add(s);
            } else if (s.contains("р")) {

            } else if (s.contains("л")) {
                result.add(s);
                result.add(s);
            } else if (!s.contains("р") && !s.contains("л")) {
                result.add(s);
            }

        }


        return result;
    }
}


//1. Создай список слов, заполни его самостоятельно.
//        2. Метод fix должен:
//        2.1. удалять из списка строк все слова, содержащие букву "р"
//        2.2. удваивать все слова содержащие букву "л".
//        2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
//        2.4. с другими словами ничего не делать.
//
//        Пример:
//        роза
//        лира
//        лоза
//
//        Выходные данные:
//        лира
//        лоза
//        лоза
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	Метод fix должен удалять из списка строк все слова, содержащие букву "р". Исключение: слова содержащие и букву "р" и букву "л" - их нужно оставить.
//        •	Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент с этим словом). Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
//        •	Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
//        •	Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".