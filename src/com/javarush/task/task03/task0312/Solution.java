package com.javarush.task.task03.task0312;

public class Solution {
    //напишите тут ваш код
    public static int convertToSeconds(int hour){
    //int 5;
    return hour * 60 * 60;

    }
    //int 5;

    public static void main(String[] args) {
        // main: вызвать метод  convertToSeconds
        // что бы вызвать другой метод в нутри main надо написать его имя
        // например чтобы вызвать метод convertToSeconds в main надо написать convertToSeconds в maim
        int a = convertToSeconds(5);
        int b = convertToSeconds(7);
        System.out.println(a);
        System.out.println(b);

    }
}
//    Добавь метод public static int convertToSeconds(int hour) который будет конвертировать часы в секунды.
//        Вызови его дважды в методе main с любыми параметрами.
//        Результаты выведи на экран, каждый раз с новой строки.
//        Требования:
//        •	Добавь метод convertToSeconds, он должен быть public static, возвращать и принимать int.
//        •	Метод convertToSeconds должен переводить переданные часы в секунды.
//        •	Метод main должен дважды вызывать метод convertToSeconds.
//        •	Метод main должен выводить результаты вызова на экран, каждый раз с новой строки.
//        •	Метод convertToSeconds не должен ничего выводить на экран.
