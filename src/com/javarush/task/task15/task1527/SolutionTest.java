package com.javarush.task.task15.task1527;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SolutionTest {
    public static void main(String[] args) throws IOException {
        //add your code here
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String URL = reader.readLine();
//        int index = URL.indexOf("?");
//        String parametersString = URL.substring(index + 1);

        Map<String,  Integer>  map =  new HashMap<>();
        map.put("areg", 1);
        map.put("petz", 2);
        map.put("haus", 3);




        String s = "areg, how are, you";


        int index = s.indexOf(",");
        index = s.indexOf(",", index + 1);


        String word = "how";

        int indexWord = s.indexOf(word);

        int length = word.length();
        //9 = 6 + 3;
        int endIndex = indexWord + length;

        String s1 = s.substring(indexWord, indexWord + length);
        System.out.println(s1);

        String[] pair = s.split(" ");

        for (String element : pair) {
            System.out.println(element);


//            String[] pair1 = element.split("a");
//            for (String element1 : pair1) {
//                System.out.println(element1);
//            }
        }

        for (String element : pair) {
            String[] pair1 = element.split("r");
            for (String element1 : pair1) {
                System.out.println(element1);
            }
        }





    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}


//    Считать с консоли URL-ссылку.
//        Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
//        URL содержит минимум 1 параметр.
//        Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
//        Если присутствует параметр obj, то передать его значение в нужный метод alert.
//        alert(double value) - для чисел (дробные числа разделяются точкой)
//        alert(String value) - для строк
//        Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.
//
//        Пример 1
//
//        Ввод:
//        http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
//
//        Вывод:
//        lvl view name
//
//        Пример 2
//
//        Ввод:
//        http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
//
//        Вывод:
//        obj name
//        double: 3.14
//
//        Требования:
//        •	Программа должна считывать с клавиатуры только одну строку.
//        •	Класс Solution не должен содержать статические поля.
//        •	Программа должна выводить данные на экран в соответствии с условием.
//        •	Программа должна вызывать метод alert() с параметром double, если значение параметра obj можно корректно преобразовать в число типа double.
//        •	Программа должна вызывать метод alert() с параметром String, если значение параметра obj нельзя корректно преобразовать в число типа double.