package com.javarush.task.task04.task0433;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
       String s = "SSSSSSSSSS";
       int n = 10;
       while (n > 0)
       {
           System.out.println(s);
           n = n - 1;
       }


    }
}


//    Вывести на экран квадрат из 10х10 букв S используя цикл while.
//        Буквы в каждой строке не разделять.
//
//        Пример вывода на экран:
//        SSSSSSSSSS
//        SSSSSSSSSS
//        SSSSSSSSSS
//        SSSSSSSSSS
//        SSSSSSSSSS
//        SSSSSSSSSS
//        SSSSSSSSSS
//        SSSSSSSSSS
//        SSSSSSSSSS
//        SSSSSSSSSS
//
//        Требования:
//        •	Программа не должна считывать текст c клавиатуры.
//        •	Программа должна выводить текст на экран.
//        •	Программа должна выводить квадрат из 10х10 букв S.
//        •	В программе должен использоваться цикл while.