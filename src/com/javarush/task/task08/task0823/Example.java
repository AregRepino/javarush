package com.javarush.task.task08.task0823;

public class Example {
    public static void main(String args[]) {
        System.out.println("Пример 1:");
        String str = "разделить  строку по разделителю";
        String[] subStr;
        String delimeter = "\\s+"; // Разделитель
        subStr = str.split(delimeter); // Разделения строки str с помощью метода split()
        // Вывод результата на экран
        for (int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
        }
    }
}
