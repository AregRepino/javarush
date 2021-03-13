package com.javarush.task.task05.task0528;


import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");

        LocalDate localDate = LocalDate.now();



        String s = dtf.format(localDate);

        System.out.println(s);

    }
}



//    Вывести на экран текущую дату в аналогичном виде "21 02 2014".
//        Требования:
//        •	Дата должна содержать день, месяц и год, разделенные пробелом.
//        •	День должен соответствовать текущему.
//        •	Месяц должен соответствовать текущему.
//        •	Год должен соответствовать текущему.
//        •	Вся дата должна быть выведена в одной строке.