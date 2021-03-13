package com.javarush.task.task09.task0918;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;

public class Solution {
    public static void main(String[] args) {
    }
// мое исключение расширяет IO исключение
    static class MyException extends IOException {
    }
// мое исключение2 расширяет исключение
    static class MyException2 extends Exception {
    }
//мое исключение3 расширяет   связь ошибка
    static class MyException3 extends RuntimeException {
    }
//мое исключение4 расширяет   ошибку

    static class MyException4 extends IllegalAccessException {
    }

}




//    Есть четыре класса MyException, MyException2, MyException3, MyException4.
//        Унаследуй классы так, чтобы у тебя появилось любые два checked исключения и любые два unchecked исключения.
//
//        Подсказка:
//        Изучи внимательно классы Exception1, Exception2, Exception3 из второй задачи этого блока.
//
//        Требования:
//        •	В классе Solution должно быть 4 вложенных класса: MyException, MyException2, MyException3 и MyException4.
//        •	Все вложенные классы должны быть унаследованы от классов исключений.
//        •	Два класса из четырех должны быть checked исключениями.
//        •	Два класса из четырех должны быть unchecked исключениями.
