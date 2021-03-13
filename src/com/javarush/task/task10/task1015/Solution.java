package com.javarush.task.task10.task1015;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код

//        int[] array = new int[5];
//        String[] arrayString = new String[3];

        ArrayList<String>[] arrayList = new ArrayList[3];
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list.add("areg");
        list.add("ily");
        list1.add("alisa");
        list1.add("papa");
        list1.add("any");
        list2.add("alina");
        list2.add("masha");
        list2.add("mama");
        list2.add("vasa");

        arrayList[0] = list;
        arrayList[1] = list1;
        arrayList[2] = list2;


        return arrayList ;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}


//    Создать массив, элементами которого будут списки строк.
//        Заполнить массив любыми данными и вывести их на экран.
//
//        Требования:
//        •	Метод createList должен объявлять и инициализировать массив с типом элементов ArrayList<String>.
//        •	Метод createList должен возвращать созданный массив.
//        •	Метод createList должен добавлять в массив элементы (списки строк). Списки должны быть не пустые.
//        •	Программа должна выводить данные на экран.
//        •	Метод main должен вызывать метод createList.
//        •	Метод main должен вызывать метод printList.