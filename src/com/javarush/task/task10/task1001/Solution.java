package com.javarush.task.task10.task1001;

public class Solution {
    public static void main(String[] args) {



        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (float) 1234.15;
        long d = (int) (a + f / c + b);
        System.out.println(d);
    }
}


//    Расставьте правильно операторы приведения типа, чтобы получился ответ: d > 0
//        int a = 0;
//        int b = (byte) a + 46;
//        byte c = (byte) (a*b);
//        double f = (char) 1234.15;
//        long d = (short) (a + f / c + b);
//
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Нельзя менять команду вывода на экран.
//        •	Метод main() должен содержать переменную a типа int.
//        •	Метод main() должен содержать переменную b типа int.
//        •	Метод main() должен содержать переменную c типа byte.
//        •	Метод main() должен содержать переменную f типа double.
//        •	Метод main() должен содержать переменную d типа long.
//        •	Начальное значение переменных при инициализации менять нельзя. Можно только редактировать операторы приведения типа (добавлять/удалять/изменять).
//        •	Программа должна выводить число больше, чем 0.