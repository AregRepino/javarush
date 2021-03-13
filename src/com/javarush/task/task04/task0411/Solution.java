package com.javarush.task.task04.task0411;

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
        checkSeason(13);
        checkSeason(0);
    }

    public static void checkSeason(int month) {
        //зима12-2
                //весна3-5
                        //лето 6-8
                                //осень 9-11
        //0 1 2 3 4 5 6 7 8 9 10 11 12
        // весение месяца больше  2 и меньше 6 месяца
//|| - или
        //напишите тут ваш код
        if ((month > 0 && month < 3) || month  == 12 ){
            System.out.println("зима");
        } else if (month > 2 && month < 6  ){
            System.out.println("весна");
        } else if (month > 5 && month < 9 ){
            System.out.println("лето");
        } else if (month > 8 && month < 12){

            System.out.println("осень");
        } else {
            System.out.println("ошибка");
        }

    }
}
