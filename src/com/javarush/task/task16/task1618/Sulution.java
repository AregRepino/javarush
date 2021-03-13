package com.javarush.task.task16.task1618;

public class Sulution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread testThread = new TestThread();
        testThread.start();

        Thread.sleep(10000);

        //         interrupt - прервать

        testThread.interrupt();


    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {


        @Override
        public void run() {


            int i = 1;




            while (!this.isInterrupted()) {


                System.out.println(i);
                i ++;
            }

        }
    }

}


//    Создай нить TestThread.
//        В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
//
//        Требования:
//        •	Класс TestThread должен быть унаследован от Thread.
//        •	Класс TestThread должен иметь public void метод run.
//        •	Метод main должен создавать объект типа TestThread.
//        •	Метод main должен вызывать метод start у объекта типа TestThread.
//        •	Метод main должен вызывать метод interrupt у объекта типа TestThread.