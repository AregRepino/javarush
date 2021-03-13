package com.javarush.task.task13.task1301;

public class Solution {
    public static void main(String[] args) throws Exception {
        BeerLover beerLover = new BeerLover();
        beerLover.askForMore("wine");
        beerLover.sayThankYou();
        boolean go = beerLover.isReadyToGoHome();
        System.out.println(go);
        beerLover.sleepOnTheFloor();
        go = beerLover.isReadyToGoHome();
        System.out.println(go);
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        public static  final boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {


        @Override
        public void askForMore(String message) {

            System.out.println(message);

        }

        @Override
        public void sayThankYou() {
            System.out.println("Thank You");

        }

        @Override
        public boolean isReadyToGoHome() {
            return Alcoholic.READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {



        }
    }
}


//1. Подумай, какой из двух интерфейсов нужно реализовать в классе BeerLover.
//        2. Добавь к классу BeerLover этот интерфейс и реализуй все его методы.
//        3. Подумай, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
//        4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.
//
//        Требования:
//        •	Класс BeerLover должен реализовывать(implements) интерфейс Alcoholic.
//        •	Класс BeerLover не должен реализовывать интерфейс Drinker напрямую(только опосредованно через Alcoholic)
//        •	В классе BeerLover должны быть реализованы все методы интерфейса Alcoholic.
//        •	В классе BeerLover должны быть реализованы все методы интерфейса Drinker.
//        •	Метод isReadyToGoHome должен возвращать значение переменной READY_TO_GO_HOME.