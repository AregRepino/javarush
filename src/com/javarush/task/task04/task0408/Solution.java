package com.javarush.task.task04.task0408;

public class Solution {
    public static void main(String[] args) {
        // compare вызов метода и передача ему аргумента или входго праметра
        compare(3);
        compare(6);
        compare(5);
        compare(5);

    }

    public static void compare(int a) {
        //напишите тут ваш код
        // if -  если (a < 5) то выполняеться команда
        if (a < 5){
            System.out.println("Число меньше 5");
            // вративном если (a > 5) то выполняеться команда
        } else if (a > 5){
            System.out.println("Число больше 5");
            // else в противном случии если все остольное не выполнилось
        } else {
            System.out.println("Число равно 5");
        }


    }
}

//    Написать метод compare(int a), чтобы он:
//        - выводил на экран строку "Число меньше 5", если параметр метода меньше 5,
//        - выводил строку "Число больше 5", если параметр метода больше 5,
//        - выводил строку "Число равно 5", если параметр метода равен 5.
//        Требования:
//        •	Программа должна выводить текст на экран.
//        •	Метод main не должен вызывать System.out.println или System.out.print.
//        •	Метод main должен вызывать метод compare.
//        •	Метод compare должен быть void.
//        •	Метод compare должен выводить текст на экран согласно заданию.