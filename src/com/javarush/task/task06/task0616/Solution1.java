package com.javarush.task.task06.task0616;

public class Solution1 {
    public static int step;

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {

        new Solution().method3();
    }

    public void method3() {
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
