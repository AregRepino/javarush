package com.javarush.task.task10.task1003;

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (byte) f;
        int b = (int) (i + f);
        System.out.println(b);
    }
}


//    Добавить одну операцию по преобразованию типа, чтобы получался ответ: b = 0
//        float f = (float)128.50;
//        int i = (int)f;
//        int b = (int)(i + f);
//
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Нельзя менять команду вывода на экран.
//        •	Метод main() должен содержать переменную f типа float.
//        •	Метод main() должен содержать переменную i типа int.
//        •	Метод main() должен содержать переменную b типа int.
//        •	Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
//        •	Программа должна выводить число 0.