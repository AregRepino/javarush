package com.javarush.task.task04.task0414;
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();


        if (x % 400 == 0  ){
            System.out.println("количество дней в году: 366");


        } else if (x % 100 != 0 && x % 4 == 0){
            System.out.println("количество дней в году: 366");


        }  else {
            System.out.println("количество дней в году: 365");
        }



    }
}

//    Ввести с клавиатуры год, определить количество дней в году. Результат вывести на экран в следующем виде:
//        количество дней в году: x
//        , где
//        х - 366 для високосного года,
//        х - 365 для обычного года.
//
//        Подсказка:
//        В високосном году - 366 дней, тогда как в обычном - 365.
//        1) если год делится без остатка на 400 это високосный год;
//        2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
//        3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
//        4) все оставшиеся года невисокосные.
//        Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
//        Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
//        Годы 2100, 2200 и 2300 - не високосные.
//        Требования:
//        •	Программа должна считывать число c клавиатуры.
//        •	Программа должна выводить текст на экран, согласно условию.
//        •	Если введенный год является високосным, необходимо вывести текст: "количество дней в году: 366".
//        •	Если введенный год не является високосным, необходимо вывести текст: "количество дней в году: 365".