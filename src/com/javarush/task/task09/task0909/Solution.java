package com.javarush.task.task09.task0909;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        int[] m = new int[2];

        try {
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }


        //напишите тут ваш код
    }
}


//    Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
//        int[] m = new int[2];
//        m[8] = 5;
//
//        Требования:
//        •	Программа должна выводить сообщение на экран.
//        •	В программе должен быть блок try-catch.
//        •	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
//        •	Выведенное сообщение должно содержать тип возникшего исключения.
//        •	Имеющийся код в методе main не удалять.