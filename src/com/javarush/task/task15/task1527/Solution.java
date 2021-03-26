package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String URL = reader.readLine();

        int indexOfQuestionMark = URL.indexOf("?");


        String s = URL.substring(indexOfQuestionMark + 1);

        String[] pairs = s.split("&");

        List<String> keys = new ArrayList<>();
        Map<String, String> map = new HashMap<>();


        for (String pair : pairs) {
            //int i = 0; i < pairs.length; i++
            //String pair = pairs[i];
            if (pair.contains("=")) {
                int indexOfEqualSign = pair.indexOf("=");
                String key = pair.substring(0, indexOfEqualSign);
                String value = pair.substring(indexOfEqualSign + 1);
                keys.add(key);
                map.put(key, value);
                //System.out.print(value + " ");
            } else {
                keys.add(pair);
                map.put(pair, null);


            }


        }


        for (String key : keys) {

            System.out.print(key + " ");
        }

        System.out.println("");






//        for (Map.Entry<String, String> entry : map.entrySet()) {
//
//            String key = entry.getKey();
//            String value = entry.getValue();
//
//
//            if (key.equals("obj")) {
//                try {
//                    alert(Double.parseDouble(value));
//
//                } catch (NumberFormatException e) {
//                    alert(value);
//                }
//
//            }
//
//        }


        for (String key : keys) {

            String value = map.get(key);


            if (key.equals("obj")) {
                try {
                    alert(Double.parseDouble(value));

                } catch (NumberFormatException e) {
                    alert(value);
                }



            }




        }



//        for (String pair : pairs) {
//            if (pair.contains("=")) {
//
//                int indexOfEqualSign = pair.indexOf("=");
//
//                String key = pair.substring(0, indexOfEqualSign);
//
//                if (key.equals("obj")) {
//
//                    String value = pair.substring(indexOfEqualSign + 1);
//
//                    try {
//
//                        alert(Double.parseDouble(value));
//                    } catch (Exception e) {
//
//                        alert(value);
//                    }
//                }
//            }
//        }




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