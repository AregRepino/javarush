package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();

    }

    static void initList(List<Number> list) {
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }

    //3


    //4 - Исправь 2 ошибки
    static void printListValues(List<Number> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //5
    static void processCastedObjects(List<Number> list) {
        for (Number object : list) {
            //Исправь 2 ошибки
            if (object instanceof Float) {
                Float a = (float) object;
                System.out.println("Is float value defined? " + !( a.isNaN() ));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }

    }

}

//
//1. Подумай что делает метод main.
//        2. Создай в классе Solution статические методы initList(List<Number> list), printListValues(List<Number> list), processCastedObjects(List<Number> list).
//        3. Найди блок кода который заполняет значениями список и перемести его в метод initList.
//        4. Найди блок кода который в цикле for выводит на экран содержимое списка и перемести его в метод printListValues.
//        5. Найди блок кода в котором для каждого объекта списка проверяется тип и выводятся сообщения на экран и перемести его в метод processCastedObjects.
//        6. Исправь 2 ошибки в методе printListValues так, чтобы на экран корректно выводилось содержимое переданного в качестве параметра списка.
//        7. Исправь 2 ошибки в методе processCastedObjects связанные с приведением типов
//        - для объекта типа Float нужно вывести "Is float value defined? " + !([Float_object].isNaN()).
//        - для объекта типа Double нужно вывести "Is double value infinite? " + [Double_object].isInfinite().
//
//        Требования:
//        В классе Solution должны быть реализованы статические методы initList(List<Number> list), printListValues(List<Number> list), processCastedObjects(List<Number> list).
//        Метод initList должен заполнять полученный список произвольными значениями.
//        Метод printListValues должен выводить содержимое полученного списка на экран.
//        Метод processCastedObjects должен анализировать элементы списка и для объектов типа Float или Double выводить на экран текст согласно условию задачи.