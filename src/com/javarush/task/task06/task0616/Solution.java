package com.javarush.task.task06.task0616;

public class Solution {
    public static int step;

    public static void main(String[] args) {
        // вызев мотода method1
        method1();
    }

    public static void method1() {
        // вызев мотода method2
       method2();
    }

    public static void method2() {
//        Solution solution = new Solution();
//        solution.method3();
        // вызев мотода method3
        new Solution().method3();
    }

    public  void method3() {
        // вызев мотода method4
        method4();
    }

    public void method4() {
        Solution.step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (Solution.step > 1)
            return;
        main(null);
    }
}

//
//    Расставьте минимальное количество static-ов, чтобы код начал работать, и программа успешно завершилась.
//
//        Требования:
//        •	Реализацию и модификаторы доступа методов менять нельзя.
//        •	Добавь модификаторы static в нужные места.
//        •	В программе должно быть только 4 модификатора static.
//        •	Программа должна выводить текст на экран.