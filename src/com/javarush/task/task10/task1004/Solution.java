package com.javarush.task.task10.task1004;

public class Solution {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println((char) nine);
        System.out.println((int) 'a');
        System.out.println((char) 97);
        System.out.println((char) 98);
        System.out.println((char) 99);
//         Вывод
//        9
//        97
//        a
//        b
//        c
    }
}


//    Добавить одну операцию по преобразованию типа, чтобы на экран вывелось 9
//        short number = 9;
//        char zero = '0';
//        int nine = (zero + number);
//
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Нельзя менять команду вывода на экран. В ней можно только добавлять операторы приведения типа.
//        •	Метод main() должен содержать переменную number типа short.
//        •	Метод main() должен содержать переменную zero типа char.
//        •	Метод main() должен содержать переменную nine типа int.
//        •	Начальное значение переменных при инициализации менять нельзя. Можно добавлять только операторы приведения типа.
//        •	Программа должна выводить число 9.