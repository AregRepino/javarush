package com.javarush.task.task09.task0926;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<>();




        int[] array = new int[5];
        array[0] = 3;
        array[1] = 5;
        array[2] = 7;
        array[3] = 10;
        array[4] = 2;
        list.add(array);

        int a = list.get(0)[2];
        System.out.println(a);

        int[] arrayA = new int[]{2, 4};
        list.add(arrayA);
        int r = list.get(1)[1];
        System.out.println(r);


        int[] arrayB = new int[4];

        for (int i = 0; i < arrayB.length;  i ++ ) {
            double random = Math.random();
            random = random * 100;
            arrayB[i] = (int)random;
        }

        list.add(arrayB);
        System.out.println(list.get(2)[1]);
        list.get(2)[1] = - 2;
        System.out.println(list.get(2)[1]);



        list.add(new int[7]);
        list.add(new int[0]);

        return list;
    }





    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {

            for (int x : array) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}


//    Создать список, элементами которого будут массивы чисел.
//        Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
//        Заполнить массивы любыми данными и вывести их на экран.
//
//        Требования:
//        •	Программа не должна считывать данные с клавиатуры.
//        •	Метод createList должен объявлять и инициализировать переменную типа ArrayList<int[]>.
//        •	Метод createList должен возвращать созданный список.
//        •	Метод createList должен добавлять в список 5 элементов.
//        •	Каждый элемент в списке должен быть массивом чисел. Длина первого должна быть 5 элементов, второго - 2, следующих - 4, 7, 0 соответственно.
//        •	Программа должна выводить на экран элементы всех массивов из списка. Каждый элемент с новой строки.