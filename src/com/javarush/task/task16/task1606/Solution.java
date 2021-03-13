package com.javarush.task.task16.task1606;
import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static void main(String[] args) throws InterruptedException {
        PrintListThread firstThread = new PrintListThread("firstThread");
        PrintListThread secondThread = new PrintListThread("secondThread");
        firstThread.start();
        firstThread.join();
        secondThread.start();

    }

    public static void printList(List<String> list, String threadName) {
        for (String item : list) {
            System.out.println(String.format("%s : %s", threadName, item));
        }
    }

    public static List<String> getList(int n) {
        List<String> result = new ArrayList<String>();
        if (n < 1) return result;

        for (int i = 0; i < n; i++) {
            result.add(String.format("String %d", (i + 1)));
        }
        return result;
    }

    public static class PrintListThread extends Thread {
        private Thread thread;

        public PrintListThread(String name) {
            super(name);
        }


//        public PrintListThread(String name, Thread thread) {
//            super(name);
//            this.thread = thread;
//        }

        public void run() {
//            if (this.thread != null) {
//                this.thread.start();
//                try {
//                    this.thread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
            printList(getList(20), getName());
        }
    }
}

//
//Подумай, в каком месте и для какого объекта нужно вызвать метод join, чтобы результат выводился по-порядку
//        сначала для firstThread, а потом для secondThread.
//        Вызови метод join в нужном месте.
//
//        Пример вывода:
//        firstThread : String 1
//        firstThread : String 2
//        ...
//        firstThread : String 19
//        firstThread : String 20
//        secondThread : String 1
//        ...
//        secondThread : String 20
//
//        Требования:
//        •	Метод main должен вызывать метод join для объекта firstThread.
//        •	Метод main не должен вызывать метод join для объекта secondThread.
//        •	Метод main не должен вызывать System.out.println() или System.out.print().
//        •	Вывод программы должен соответствовать примеру из задания.