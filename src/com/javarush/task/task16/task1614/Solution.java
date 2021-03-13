package com.javarush.task.task16.task1614;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static volatile List<String> list = new ArrayList<String>(5);

    static {
        for (int i = 0; i < 100; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(100), "Countdown");
        Thread  thread = new Thread(new Countdown(50), "Red");
        t.start();

        thread.start();

    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
            }
        }

        public void printCountdown() throws InterruptedException {
            //add your code here - добавь код тут
            Thread.sleep(500);
            countFrom--;
            System.out.println(list.get(countFrom));
        }
    }
}

//
//1. Разберись, что делает программа.
//        2. Реализуй логику метода printCountdown так, чтобы программа каждые полсекунды выводила объект из переменной list. Выводить нужно в обратном порядке - от переданного в Countdown индекса до нуля.
//
//        Пример:
//        Передан индекс 3
//
//        Пример вывода в консоль:
//        Строка 2
//        Строка 1
//        Строка 0
//
//        Требования:
//        •	Метод printCountdown должен работать примерно полсекунды.
//        •	Метод printCountdown должен уменьшать (декрементировать) значение переменной countFrom.
//        •	Метод printCountdown должен выводить элемент списка list с индексом равным новому значению countFrom.
//        •	Метод main должен создавать один объект типа Countdown.
//        •	Вывод программы должен соответствовать примеру из условия.