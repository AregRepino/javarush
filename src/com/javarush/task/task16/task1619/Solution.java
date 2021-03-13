package com.javarush.task.task16.task1619;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Runner runner = new Runner();
        Thread t = new Thread(runner);

        t.start();
        Thread.sleep(3000);
        ourInterruptMethod(runner);
    }
// наш метод прерывания
    public static void ourInterruptMethod(Runner runner) {

        runner.makeDead();



    }

    public static class Runner implements Runnable {
// alive - живой
        boolean alive = true;
        public void run() {
            while (alive) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                    //Прерванное исключение
                } catch (InterruptedException e) {
                }
            }
        }

//make dead   сделать мертвым

        public void  makeDead() {

            this.alive = false;

        }


    }
}


//Разберись, как работает программа.
//        Сделай так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
//        Нельзя использовать метод interrupt.
//
//        Требования:
//        •	В классе Solution должен быть публичный статический метод ourInterruptMethod без параметров.
//        •	Метод run должен выводить надпись "he-he" каждые пол секунды, пока не будет вызван метод ourInterruptMethod.
//        •	Необходимо изменить условие цикла while в методе run.
//        •	Метод main должен создавать объект типа Thread передавая в конструктор объект типа TestThread.
//        •	Метод main должен вызывать метод start у объекта типа Thread.
//        •	Метод main должен вызывать метод ourInterruptMethod.