package com.javarush.task.task20.task2024;

import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution implements Serializable {
    int node;
    List<Solution> edges = new LinkedList<>();

    public static void main(String[] args) {
        Solution solution1 = new Solution();
        solution1.node = 1;

        Solution solution2 = new Solution();
        solution2.node = 2;


//        Solution solution3 = new Solution();
//        solution2.node = 3;


        Solution solution4 = new Solution();
        solution4.node = 4;


        Solution solution5 = new Solution();
        solution5.node = 5;

        solution1.edges.add(solution2);

        solution2.edges.addAll(Arrays.asList(solution2, solution4, solution5));

        solution4.edges.add(solution1);
        solution4.edges.add(solution5);


        solution5.edges.add(solution4);

        System.out.println("Hi");


    }
}

//
//    Прочитать в дополнительных материалах о сериализации графов.
//        Дан ориентированный плоский граф Solution, содержащий циклы и петли.
//
//        Пример, http://edu.nstu.ru/courses/saod/images/graph1.gif
//
//        Сериализовать Solution.
//        Все данные должны сохранить порядок следования.
//
//        Требования:
//        •	В классе Solution должно существовать поле edges.
//        •	В классе Solution должно существовать поле node.
//        •	Тип поля node должен быть int.
//        •	Класс Solution должен поддерживать интерфейс Serializable.